package com.example.customer1.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer1.model.Customer;
import com.example.customer1.repository.CustomerRepository;

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
	public Customer findById(@PathVariable("id") UUID customerId) {
		return customerRepository.findById(customerId);
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable("id") UUID customerId, @RequestBody Customer customer) {
		if (customerRepository.findById(customerId) != null) {
			Customer customerToSave = new Customer(customer.name(), customer.email(), customer.phone());
			return customerRepository.save(customerToSave);
		} else {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable("id") UUID customerId) {
		customerRepository.deleteById(customerId);
	}
}
