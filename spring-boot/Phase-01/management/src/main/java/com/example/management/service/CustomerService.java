package com.example.management.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.management.model.Address;
import com.example.management.model.Communication;
import com.example.management.model.Company;
import com.example.management.model.Customer;
import com.example.management.model.CustomerDetailsDTO;
import com.example.management.repository.AddressRepository;
import com.example.management.repository.CommunicationRepository;
import com.example.management.repository.CompanyRepository;
import com.example.management.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CompanyRepository companyRepository;
    private final AddressRepository addressRepository;
    private final CommunicationRepository communicationRepository;

    public CustomerService(CustomerRepository customerRepository,
                           CompanyRepository companyRepository,
                           AddressRepository addressRepository,
                           CommunicationRepository communicationRepository) {
        this.customerRepository = customerRepository;
        this.companyRepository = companyRepository;
        this.addressRepository = addressRepository;
        this.communicationRepository = communicationRepository;
    }

    @Transactional
    public CustomerDetailsDTO createCustomerDTO(Customer customer, Company company,
                                                Address address, Communication communication) {
        // 1. Company first: customers.company_id is a foreign key to companies.
        Company savedCompany = companyRepository.save(company);

        // 2. Customer next, linked to the company that was actually saved.
        Customer savedCustomer = customerRepository.save(new Customer(
                customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
                customer.getJobTitle(), customer.getEmail(), customer.getPhone(),
                savedCompany));

        // 3. Address and communication last, linked to the saved customer's id.
        Address savedAddress = addressRepository.save(new Address(
                address.getAddressId(), savedCustomer, address.getStreet(),
                address.getCity(), address.getState(), address.getZip()));

        Communication savedCommunication = communicationRepository.save(new Communication(
                communication.getCommunicationId(), savedCustomer,
                communication.getCommunicationType(), communication.getCommunicationValue()));

        // Build the DTO from the saved objects, because they carry the generated ids.
        return new CustomerDetailsDTO(savedCustomer, savedCompany,
                List.of(savedAddress), List.of(savedCommunication));
    }

    @Transactional(readOnly = true)
    public CustomerDetailsDTO getCustomerDetailsDTO(UUID customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer not found"));
        

        Company company = 
                 companyRepository.findById(customer.getCompany().getCompanyId()).orElseThrow(()->new RuntimeException("Company not found"));

        List<Address> addresses = toList(addressRepository.findAllByCustomerId(customerId));
        List<Communication> communications = toList(communicationRepository.findAllByCustomerId(customerId));

        return new CustomerDetailsDTO(customer, company, addresses, communications);
    }

    private static <T> List<T> toList(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).toList();
    }
}