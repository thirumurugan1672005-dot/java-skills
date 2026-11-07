package com.example.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.client.RestTestClient;

import com.example.customer.model.Customer;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = "spring.datasource.url=jdbc:h2:mem:api-test-db")
@AutoConfigureRestTestClient
class CustomerApplicationTests {
       
	@Autowired
	private RestTestClient restTestClient;
	@Test
	
	void shouldcreateAndRetreiveCustomer() {
		  
		
		//  get the data
		restTestClient.get().uri("/api/v1/customers")
		                               .exchange()
		                               .expectStatus().isOk()
		                               .expectBody(Customer[].class)
		                               .value(customers->assertThat(customers).hasSize(3));
		
		// create customer 
		Customer customer = new Customer("jenny","jenny@gmail.com","12345677");
		restTestClient.post().uri("/api/v1/customers")
		                                   .body(customer)
		                                   .exchange()
		                                   .expectStatus().isCreated()
		                                   .expectBody(Customer.class)
		                                   .value(cust->{
		                                	   assertThat(customer).isNotNull();
		                                	  assertThat(cust.name().equals(customer.name())) ;
		                                   });
		
		
	//  get the data after creating
			restTestClient.get().uri("/api/v1/customers")
			                               .exchange()
			                               .expectStatus().isOk()
			                               .expectBody(Customer[].class)
			                               .value(customers->assertThat(customers).hasSize(4));
	}

}
