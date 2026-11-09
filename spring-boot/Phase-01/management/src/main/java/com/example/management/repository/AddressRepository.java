package com.example.management.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.management.model.Address;
@Repository 
public interface AddressRepository extends JpaRepository<Address,UUID> {
    @Query ("SELECT a from Address a WHERE a.customer.id = :customerId")
	public List<Address> findAllByCustomerId(@Param("customerId") UUID customerId);

}
