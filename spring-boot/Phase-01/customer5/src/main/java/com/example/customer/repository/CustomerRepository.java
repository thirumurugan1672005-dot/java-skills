package com.example.customer.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;


import org.springframework.stereotype.Repository;

import com.example.customer.model.Customer;

@Repository 
public interface CustomerRepository  extends ListCrudRepository<Customer,UUID> {
	   
	List<Customer> findByEmail(String email);
	List<Customer> findByName(String name);

	List<Customer> findByEmailEndingWith(String domain);



}
