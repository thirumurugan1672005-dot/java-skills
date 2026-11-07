package com.example.customer2.model;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Customer(UUID id, 
    @NotBlank(message = "name should not be empty")
    String name, 
    @NotBlank(message = "email should not be empty")
    @Email (message = "invalid email format")
    String email, 
    @Pattern(regexp = "^(?:[0-9\\-().\\/]\\s?){6,15}[0-9]$", message = "invalid phone format")
    String phone
) {
    public Customer(String name, String email, String phone) {
        this(UUID.randomUUID(), name, email, phone);
    }
}
