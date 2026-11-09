package com.example.management.model;

import java.util.List;

public record CustomerDetailsDTO(Customer customer,Company company,List<Address>addresses,List<Communication>communications) {

}
