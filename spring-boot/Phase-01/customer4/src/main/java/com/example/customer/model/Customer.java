package com.example.customer.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public record Customer(UUID id,
		@NotBlank(message = "name cannot be empty")
		String name,
		@NotBlank(message = "email cannot be empty")
		String email,
		@NotBlank(message = "phone cannot be empty")
		String phone) {
        public Customer(String name,String email,String phone) {
        	this(UUID.randomUUID(),name,email,phone);
        }
}
