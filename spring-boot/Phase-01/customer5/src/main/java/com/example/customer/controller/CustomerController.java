package com.example.customer.controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
      private final CustomerRepository customerRepository;
      
      public CustomerController(CustomerRepository customerRepository) {
    	   this.customerRepository = customerRepository;
      }
      
      @GetMapping
      public Iterable<Customer> findAllCustomers(){
    	  return customerRepository.findAll();
      }
      @GetMapping("/{id}")
      public ResponseEntity<Customer> findCustomerById(@PathVariable("id") UUID customerId) {
    	           Customer customer = customerRepository.findById(customerId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer not found"));
                 return ResponseEntity.ok().body(customer);
      }
      @PostMapping
      public ResponseEntity<Customer> createCustomer(@Valid  @RequestBody Customer customer) {
    	                     Customer saved = customerRepository.save(customer);
                           URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.id()).toUri();
                           return ResponseEntity.created(uri).body(saved);
      }
      @PutMapping("/{id}")
      public ResponseEntity<Customer> updateCustomer(@PathVariable("id") UUID customerId , @Valid  @RequestBody  Customer customer){
            if(customerRepository.findById(customerId)==null){
                  return ResponseEntity.notFound().build();
            }
            Customer saved  = customerRepository.save(customer);
             return ResponseEntity.ok().body(saved);
      }
      @DeleteMapping("/{id}")
      public ResponseEntity<Void> deleteCustomer(@PathVariable("id") UUID customerId) {
    	     if(customerRepository.findById(customerId)==null){
                  return  ResponseEntity.notFound().build();
           }
           customerRepository.deleteById(customerId);
           return ResponseEntity.noContent().build();
      }
}
