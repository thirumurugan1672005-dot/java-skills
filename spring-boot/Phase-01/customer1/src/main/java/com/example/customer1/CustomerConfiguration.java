package com.example.customer1;



import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.customer1.model.Customer;
import com.example.customer1.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {
     private final  CustomerRepository customerRepository;

	CustomerConfiguration(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Bean
	ApplicationListener<ApplicationReadyEvent> createApp() {
		return event -> {
			Customer customer1 = new Customer("John", "john@gmail.com", "123456789");
			Customer customer2 = new Customer("Jack", "jack@gmail.com", "8765432190");
			Customer customer3 = new Customer("Mike", "mike@gmail.com", "987656789");
			customerRepository.save(customer1);
			customerRepository.save(customer2);
			customerRepository.save(customer3);
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
