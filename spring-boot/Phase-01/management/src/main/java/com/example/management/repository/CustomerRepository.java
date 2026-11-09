package com.example.management.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.management.model.Customer;

@Repository 
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}