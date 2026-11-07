package com.example.customer.repository;

import java.util.List;
import java.util.UUID;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.customer.model.Customer;

@Component
public class CustomerRepository implements Repository<Customer, UUID> {
	private final JdbcTemplate jdbcTemplate;

	public CustomerRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer save(Customer customer) {

		UUID id = customer.id() != null ? customer.id() : UUID.randomUUID();

		int updated = jdbcTemplate.update("UPDATE customer set name=? , email=? ,phone=? WHERE id=?", customer.name(),
				customer.email(), customer.phone(), id);
		if (updated == 0) {
			String sql = "INSERT INTO customer VALUES (?,?,?,?)";
			jdbcTemplate.update(sql, id, customer.name(), customer.email(), customer.phone());
		}
		return customer;

	}

	@Override
	public Customer findById(UUID id) {
		String sql = "SELECT * from customer where id=?";
		List<Customer> customers = jdbcTemplate.query(sql, new CustomerRowMapper(), id);
		return customers.stream().findFirst().orElse(null);
	}

	@Override
	public Iterable<Customer> findAll() {
		String sql = "SELECT * from customer";
		return jdbcTemplate.query(sql, new CustomerRowMapper());
	}

	@Override
	public void deleteById(UUID id) {
		String sql = "DELETE from customer WHERE id=?";
		jdbcTemplate.update(sql, id);

	}

}
