package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
	private  double price;
	
/**	// Direct value injection : we cannot make final
	@Autowired
    private Tyre tyre;
    
 */
	
	private final Tyre tyre;
	
	@Autowired
	public Car(Tyre tyre) {
		this.tyre = tyre;
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
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	
	/*
	  Injection using setter (Not Recommended)
	  
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	*/
	
	
	
    
}
