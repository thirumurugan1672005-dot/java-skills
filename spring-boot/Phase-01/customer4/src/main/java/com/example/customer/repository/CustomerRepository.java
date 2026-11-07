package com.example.customer.repository;

import java.util.UUID;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import com.example.customer.model.Customer;

@Component
public class CustomerRepository implements Repository<Customer, UUID> {
	private final JdbcClient jdbcClient;

	public CustomerRepository(JdbcClient jdbcClient) {
		this.jdbcClient = jdbcClient;
	}

	@Override
	public Customer save(Customer customer) {

		UUID id = customer.id() != null ? customer.id() : UUID.randomUUID();

		int updated = jdbcClient.sql("UPDATE customer SET name=:name ,email=:email,phone=:phone WHERE id=:id")
				.param("id", id)
				.param("name", customer.name())
				.param("email", customer.email())
				.param("phone", customer.phone())
				.update();

		if (updated == 0) {
			String sql = "INSERT INTO customer VALUES (:id , :name , :email , :phone)";
			jdbcClient.sql(sql)
					.param("id", id)
					.param("name", customer.name())
					.param("email", customer.email())
					.param("phone", customer.phone())
					.update();

		}
		return customer;

	}

	@Override
	public Customer findById(UUID id) {
		String sql = "SELECT * from customer where id=:id";
		return jdbcClient.sql(sql).param("id", id).query(Customer.class).optional().orElse(null);

	}

	@Override
	public Iterable<Customer> findAll() {
		String sql = "SELECT * from customer";
		return jdbcClient.sql(sql).query(Customer.class).list();
	}

	@Override
	public void deleteById(UUID id) {
		String sql = "DELETE from customer WHERE id=:id";
		jdbcClient.sql(sql).param("id", id).update();

	}

}
