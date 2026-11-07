package com.example.customer1.repository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.example.customer1.model.Customer;

@Component
public class CustomerRepository implements Repository<Customer, UUID> {

	private final ConcurrentHashMap<UUID, Customer> map = new ConcurrentHashMap<>();

	@Override
	public Customer save(Customer data) {
		if (data.id() == null) {
			data = new Customer(data.name(), data.email(), data.phone());
		}
		map.put(data.id(), data);
		return data;
	}

	@Override
	public Customer findById(UUID id) {
		return map.get(id);
	}

	@Override
	public Iterable<Customer> findAll() {
		return map.values();
	}

	@Override
	public void deleteById(UUID id) {
	         map.remove(id);
		
	}

}
