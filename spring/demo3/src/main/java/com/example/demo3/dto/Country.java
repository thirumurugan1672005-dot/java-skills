package com.example.demo3.dto;

public class Country {
    private String name;
    private Long population;
    
    public static Country of(String name , Long population) {
    	Country country = new Country();
    	country.setName(name);
    	country.setPopulation(population);
    	return country;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
    
}
