package com.example.management.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "communications")
public class Communication{
	@Id 
	@GeneratedValue (strategy = GenerationType.UUID)
	private UUID communicationId;
	@JsonIgnore 
	@ManyToOne 
	@JoinColumn (name="customer_id")
	private Customer customer;
	private String communicationType;
	private String communicationValue;

	
	public Communication(UUID communicationId, Customer customer, String communicationType, String communicationValue) {
		this.communicationId = communicationId;
		this.customer = customer;
		this.communicationType = communicationType;
		this.communicationValue = communicationValue;
	}
	public Communication(){

	}
	public UUID getCommunicationId() {
		return communicationId;
	}
	public void setCommunicationId(UUID communicationId) {
		this.communicationId = communicationId;
	}
	
	public String getCommunicationType() {
		return communicationType;
	}
	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}
	public String getCommunicationValue() {
		return communicationValue;
	}
	public void setCommunicationValue(String communicationValue) {
		this.communicationValue = communicationValue;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}

      
	

