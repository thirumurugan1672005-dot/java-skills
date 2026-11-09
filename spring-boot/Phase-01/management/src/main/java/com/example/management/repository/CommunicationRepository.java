package com.example.management.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.management.model.Communication;

@Repository 
public interface CommunicationRepository extends JpaRepository<Communication, UUID> {
    @Query ("SELECT c FROM Communication c WHERE c.customer.id = :customerId ")

    public List<Communication> findAllByCustomerId(@Param("customerId") UUID customerId);
}