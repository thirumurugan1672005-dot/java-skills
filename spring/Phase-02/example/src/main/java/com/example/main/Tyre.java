package com.example.main;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
   private Long id;
   private String brand;
   private double price;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
