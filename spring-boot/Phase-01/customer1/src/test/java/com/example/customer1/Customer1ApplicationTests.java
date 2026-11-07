package com.example.customer1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.client.RestTestClient;

import com.example.customer1.model.Customer;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureRestTestClient
class Customer1ApplicationTests {
         
	@Autowired
	private RestTestClient restTestClient;
	
	@Test
	void createCustomersAndTest() {
		  restTestClient.get().uri("/api/v1/customers")
		                         .exchange()
		                         .expectStatus().isOk()
		                         .expectBody(Customer[].class)
		                         .value(customers -> assertThat(customers).hasSize(3));
		  
		  Customer newCustomer = new Customer("master","master@gmail.com","1234567890");
		  
		  restTestClient.post().uri("/api/v1/customers")
		                               .body(newCustomer)
		                               .exchange()
		                               .expectStatus().isOk()
		                               .expectBody(Customer.class)
		                               .value(customer->{
		                            	    assertThat(customer).isNotNull();
		                            	    assertThat(customer.name().equals(newCustomer.name()));
		                               });
		                               
		  
		  restTestClient.get().uri("/api/v1/customers")
          .exchange()
          .expectStatus().isOk()
          .expectBody(Customer[].class)
          .value(customers -> assertThat(customers).hasSize(4));
	}


}
