package com.example.management.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="customers")
public class  Customer{
	@Id 
	   @GeneratedValue (strategy = GenerationType.UUID)
		private UUID customerId ;
	
		private String firstName;
		private String lastName;
		private String jobTitle;
		private String email;
		private String phone;
		
		@ManyToOne 
		@JoinColumn (name = "company_id")
		private Company company;

		@OneToMany (mappedBy = "customer", orphanRemoval = true,cascade = CascadeType.ALL)
		private List<Address>addresses;

		@OneToMany(mappedBy = "customer",orphanRemoval = true,cascade = CascadeType.ALL)
        private List<Communication>communications;

     public Customer(){

	 }		
  
		public Customer(UUID customerId, String firstName, String lastName, String jobTitle, String email, String phone
				) {
			this.customerId = customerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.email = email;
			this.phone = phone;
			
		}
		public Customer(UUID customerId, String firstName, String lastName, String jobTitle, String email, String phone,
				Company company) {
			this.customerId = customerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.email = email;
			this.phone = phone;
			this.company = company;
		}

		public UUID getCustomerId() {
			return customerId;
		}

		public void setCustomerId(UUID customerId) {
			this.customerId = customerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

		public List<Address> getAddresses() {
			return addresses;
		}

		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}

		public List<Communication> getCommunications() {
			return communications;
		}

		public void setCommunications(List<Communication> communications) {
			this.communications = communications;
		}

		

		
}