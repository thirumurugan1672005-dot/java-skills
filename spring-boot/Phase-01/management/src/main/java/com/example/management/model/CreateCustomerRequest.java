package com.example.management.model;

/**
 * Request body for creating a customer together with its company,
 * address and communication details in a single call.
 */
public record CreateCustomerRequest(
        Customer customer,
        Company company,
        Address address,
        Communication communication) {
}