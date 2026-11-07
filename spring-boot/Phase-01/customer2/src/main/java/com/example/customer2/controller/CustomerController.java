package com.example.customer2.controller;

import java.net.URI;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.customer2.model.Customer;
import com.example.customer2.repository.CustomerRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
	private final CustomerRepository customerRepository;

	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@GetMapping
	public Iterable<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> findById(@PathVariable("id") UUID customerId) {
		Customer customer =  customerRepository.findById(customerId);
		return ResponseEntity.ok().body(customer);
	}

	@PostMapping
	public ResponseEntity<Customer> createCustomer(@Valid  @RequestBody Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newCustomer.id()).toUri();

		return ResponseEntity.created(uri).body(newCustomer);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") UUID customerId, @Valid  @RequestBody Customer customer) {
		if (customerRepository.findById(customerId) != null) {
			Customer customerToSave = new Customer(customer.name(), customer.email(), customer.phone());
			Customer saved =  customerRepository.save(customerToSave);
			return ResponseEntity.ok().body(saved);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable("id") UUID customerId) {
		  if(customerRepository.findById(customerId)  != null){
			      return ResponseEntity.notFound().build();
		  }
		  return ResponseEntity.noContent().build();
	}
}
