package com.example.management.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="company")
public class Company{
	@Id 
	@GeneratedValue (strategy = GenerationType.UUID)
	private UUID companyId;
	private String companyName;
	private String industry;
	private String website;


	public Company(){
		
	}
    public Company(UUID companyId, String companyName, String industry, String website) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.industry = industry;
		this.website = website;
	}
	public UUID getCompanyId() {
		return companyId;
	}
	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	
}
        
	