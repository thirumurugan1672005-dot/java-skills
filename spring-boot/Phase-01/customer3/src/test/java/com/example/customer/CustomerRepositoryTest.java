package com.example.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import  static  org.assertj.core.api.Assertions.assertThat;

@SpringBootTest 
@Transactional 

public class CustomerRepositoryTest {
     @Autowired 
     private CustomerRepository customerRepository;
    

   

     @Test 

     void createAndRetrieveCustomers(){
         // create customer 
         Customer customer = new Customer("harini","harini@gmail.com","12345678");
        Customer saved =  customerRepository.save(customer);
         assertThat(saved).isNotNull();

        // find the customer 
        Customer find = customerRepository.findById(customer.id());
        assertThat(customer.name().equals(find.name()));

        // update
        Customer updatedCustomer = new Customer(find.id(),"Updated-name","up@gmail.com","1234556789");
         customerRepository.save(updatedCustomer);
         Customer updated = customerRepository.findById(updatedCustomer.id());
         assertThat(updated.name().equals(find.name()));

        // delete the customer
       
          customerRepository.deleteById(customer.id());
          assertThat(customerRepository.findById(customer.id())).isNull();

     }
}
