package com.example.customer1.model;

import java.util.UUID;

public record Customer(UUID id, String name, String email, String phone) {
    public Customer(String name, String email, String phone) {
        this(UUID.randomUUID(), name, email, phone);
    }
}
