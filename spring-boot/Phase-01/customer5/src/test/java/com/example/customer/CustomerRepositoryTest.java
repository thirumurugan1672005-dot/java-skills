package com.example.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

@SpringBootTest(properties = "spring.datasource.url=jdbc:h2:mem:customer_repo_test")
@Transactional

public class CustomerRepositoryTest {
     @Autowired
     private CustomerRepository customerRepository;

     @Test

     void shouldSaveAndFindCustomers() {

          Customer customer = new Customer(null,"Test-customer", "test@gmail.com", "1234567890");
          Customer saved = customerRepository.save(customer);

          assertThat(saved.id()).isNotNull();

          Optional<Customer> cust = customerRepository.findById(saved.id());
          assertThat(cust).isPresent();
          assertThat(cust.get().name()).isEqualTo(saved.name());

     }

     @Test 
     void shouldfindAllCustomers(){
          customerRepository.save(new Customer(null,"User-01","user@gmail.com","1234567890"));
          customerRepository.save(new Customer(null,"User-02","user2@gmail.com","1234567890"));
            

       Iterable<Customer> customers = customerRepository.findAll();
          assertThat(customers).hasSizeGreaterThanOrEqualTo(2);

     }

     @Test
     void shouldDeleteCustomer() {
          Customer customer = new Customer(null, "User-01", "user@gmail.com", "12323422222");
          Customer saved = customerRepository.save(customer);
          assertThat(saved.id()).isNotNull();
          customerRepository.deleteById(saved.id());
          assertThat(customerRepository.findById(saved.id())).isEmpty();

     }

     @Test
     void shouldFindByName() {
          Customer customer = new Customer(null, "User-01", "user@gmail.com", "1234456");
          Customer saved = customerRepository.save(customer);
          assertThat(saved.id()).isNotNull();
          List<Customer> customers = customerRepository.findByName(saved.name());
          assertThat(customers).hasSizeGreaterThanOrEqualTo(1);
     }

     @Test
     void shouldFindByEmailEndingWith() {
          customerRepository.save(new Customer(null, "Josh", "josh@spring.io",
                    "123"));
          List<Customer> result = customerRepository.findByEmailEndingWith("spring.io");
          assertThat(result).isNotEmpty();
          assertThat(result.get(0).name()).isEqualTo("Josh");
     }
}
