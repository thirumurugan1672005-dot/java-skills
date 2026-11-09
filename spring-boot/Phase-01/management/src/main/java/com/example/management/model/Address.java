package com.example.management.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name = "addresses")
public class Address{

    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
     private  UUID addressId;
    
     @JsonIgnore 
     @ManyToOne
     @JoinColumn (name = "customer_id")
     private Customer customer;
     private String street;
     private String city;
     private String state;
     private String zip;

     
     public Address(UUID addressId, Customer customer, String street, String city, String state, String zip) {
        this.addressId = addressId;
        this.customer = customer;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address(){

    }
     public UUID getAddressId() {
         return addressId;
     }
     public void setAddressId(UUID addressId) {
         this.addressId = addressId;
     }
   
     public String getStreet() {
         return street;
     }
     public void setStreet(String street) {
         this.street = street;
     }
     public String getCity() {
         return city;
     }
     public void setCity(String city) {
         this.city = city;
     }
     public String getState() {
         return state;
     }
     public void setState(String state) {
         this.state = state;
     }
     public String getZip() {
         return zip;
     }
     public void setZip(String zip) {
         this.zip = zip;
     }
     public Customer getCustomer() {
         return customer;
     }
     public void setCustomer(Customer customer) {
         this.customer = customer;
     }

     
      
          
}
