package com.example.management;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.client.RestTestClient;

import com.example.management.model.Address;
import com.example.management.model.Communication;
import com.example.management.model.Company;
import com.example.management.model.CreateCustomerRequest;
import com.example.management.model.Customer;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureRestTestClient
class ManagementApplicationTests {

    private static final String BASE_URL = "/api/v1/management";

    @Autowired
    private RestTestClient restTestClient;

    // ---------------------------------------------------------------
    // POST /api/v1/management
    // ---------------------------------------------------------------

    @Test
    void createCustomer_returns201AndCreatedDetails() {
        String email = uniqueEmail();

        String body = restTestClient.post()
                .uri(BASE_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .body(newRequest(email))
                .exchange()
                .expectStatus().isCreated()
                .expectBody(String.class)
                .returnResult()
                .getResponseBody();

        // shows the real response, so field names and values can be compared
        System.out.println("CREATE RESPONSE BODY = " + body);

        DocumentContext json = JsonPath.parse(body);

        // soft assertions: one run lists EVERY field that differs (expected vs actual)
        assertSoftly(softly -> {
            softly.assertThat(text(json, "$.customer.customerId")).as("customer.customerId")
                    .isNotNull().doesNotStartWith(MISSING);
            softly.assertThat(text(json, "$.customer.firstName")).as("customer.firstName")
                    .isEqualTo("Test");
            softly.assertThat(text(json, "$.customer.lastName")).as("customer.lastName")
                    .isEqualTo("Customer");
            softly.assertThat(text(json, "$.customer.email")).as("customer.email")
                    .isEqualTo(email);
            softly.assertThat(text(json, "$.company.companyId")).as("company.companyId")
                    .isNotNull().doesNotStartWith(MISSING);
            softly.assertThat(text(json, "$.company.companyName")).as("company.companyName")
                    .isEqualTo("Test Company Pvt Ltd");
            softly.assertThat(text(json, "$.addresses[0].street")).as("addresses[0].street")
                    .isEqualTo("1 Test Street");
            softly.assertThat(text(json, "$.addresses[0].city")).as("addresses[0].city")
                    .isEqualTo("Test City");
            softly.assertThat(text(json, "$.communications[0].communicationType"))
                    .as("communications[0].communicationType").isEqualTo("EMAIL");
            softly.assertThat(text(json, "$.communications[0].communicationValue"))
                    .as("communications[0].communicationValue").isEqualTo(email);
        });

        // "created" should also mean "can be read back"
        String customerId = JsonPath.read(body, "$.customer.customerId");
        restTestClient.get()
                .uri(BASE_URL + "/{id}", customerId)
                .exchange()
                .expectStatus().isOk();
    }

    // ---------------------------------------------------------------
    // GET /api/v1/management/{id}
    // ---------------------------------------------------------------

    @Test
    void getCustomerDetails_returnsSavedCustomer() {
        String email = uniqueEmail();

        // arrange: create through the API and read back the generated id
        String createdBody = restTestClient.post()
                .uri(BASE_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .body(newRequest(email))
                .exchange()
                .expectStatus().isCreated()
                .expectBody(String.class)
                .returnResult()
                .getResponseBody();

        String customerId = JsonPath.read(createdBody, "$.customer.customerId");

        // act + assert
        restTestClient.get()
                .uri(BASE_URL + "/{id}", customerId)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.customer.customerId").isEqualTo(customerId)
                .jsonPath("$.customer.email").isEqualTo(email)
                .jsonPath("$.company.companyName").isEqualTo("Test Company Pvt Ltd")
                .jsonPath("$.addresses[0].street").isEqualTo("1 Test Street")
                .jsonPath("$.communications[0].communicationValue").isEqualTo(email);
    }

    @Test
    void getCustomerDetails_unknownId_returns404() {
        restTestClient.get()
                .uri(BASE_URL + "/{id}", UUID.randomUUID())
                .exchange()
                .expectStatus().isNotFound();
    }

    @Test
    void getCustomerDetails_invalidUuid_returns400() {
        restTestClient.get()
                .uri(BASE_URL + "/{id}", "not-a-uuid")
                .exchange()
                .expectStatus().isBadRequest();
    }

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private static final String MISSING = "<missing path>";

    // returns the value as text, null if the JSON value is null,
    // or "<missing path>" if the field is not in the response at all
    private static String text(DocumentContext json, String path) {
        try {
            Object value = json.read(path);
            return value == null ? null : String.valueOf(value);
        } catch (PathNotFoundException e) {
            return MISSING;
        }
    }

    private CreateCustomerRequest newRequest(String email) {
        Customer customer = customer(email);
        Company company = company();
        Address address = address(customer);
        Communication communication = communication(customer, email);
        return new CreateCustomerRequest(customer, company, address, communication);
    }

    // unique per test, so a unique constraint on email never collides
    private String uniqueEmail() {
        return "test." + UUID.randomUUID() + "@example.com";
    }

    // ids are null: the database generates them
    private Customer customer(String email) {
        return new Customer(
                null,
                "Test",
                "Customer",
                "Software Engineer",
                email,
                "9999999999",
                null);
    }

    private Company company() {
        return new Company(
                null,
                "Test Company Pvt Ltd",
                "Software",
                "https://www.example.com");
    }

    private Address address(Customer customer) {
        return new Address(
                null,
                customer,
                "1 Test Street",
                "Test City",
                "Test State",
                "600001");
    }

    private Communication communication(Customer customer, String email) {
        return new Communication(
                null,
                customer,
                "EMAIL",
                email);
    }
}