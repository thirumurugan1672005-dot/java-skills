package com.example.customer.model;

import java.util.UUID;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
@Table("CUSTOMERS")
public record Customer(
	@Id
	UUID id,
		@NotBlank(message = "name cannot be empty")
		String name,
		@NotBlank(message = "email cannot be empty")
		String email,
		@NotBlank(message = "phone cannot be empty")
		String phone) 
 {
     

	
}
