package com.example.customer;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {
       private final CustomerRepository customerRepository;
       public CustomerConfiguration(CustomerRepository customerRepository) {
    	   this.customerRepository = customerRepository;
       }
       @Bean
	   
       ApplicationListener<ApplicationReadyEvent> intialiseData(){
    	    return event ->{
    	    	customerRepository.save(new Customer("mike","mike@gmail.com","123456789"));
    	    	customerRepository.save(new Customer("jack","jack@gmail.com","123456789"));
    	    	customerRepository.save(new Customer("jane","jane@gmail.com","123456789"));
    	    	customerRepository.findAll().forEach(System.out::println);
    	    };
       }
}
