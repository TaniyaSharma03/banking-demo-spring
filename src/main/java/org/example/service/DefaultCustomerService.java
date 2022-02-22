package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryDB;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("customerService")
public class DefaultCustomerService implements CustomerService {

    //private CustomerRepositoryDB repository = new CustomerRepositoryDB();
private CustomerRepository repository;

    public DefaultCustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

}