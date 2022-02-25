package org.example.service;
import org.example.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;
public interface CustomerService {


    public List<Customer> getAllCustomers();
    public ResponseEntity<Customer> getCustomer(Long id);

    void deleteCustomer(Long id);

    Customer saveCustomer(Customer customer);
}