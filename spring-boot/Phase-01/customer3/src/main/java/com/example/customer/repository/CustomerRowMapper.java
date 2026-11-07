package com.example.customer.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;

import com.example.customer.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
           UUID id = UUID.fromString(rs.getString("id"));
           String name = rs.getString("name");
           String email = rs.getString("email");
           String phone = rs.getString("phone");
           return  new Customer(id,name,email,phone);
    }
    
}
