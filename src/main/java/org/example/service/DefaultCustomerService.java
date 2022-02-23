package org.example.service;
import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import java.util.List;

//@Service("customerService")
public class DefaultCustomerService implements CustomerService {

    //private CustomerRepositoryDB repository = new CustomerRepositoryDB();
private CustomerRepository repository;
public DefaultCustomerService(){}
    //using setter
    public void setCustomerRepository(CustomerRepository repository) {
        this.repository = repository;
    }


   /* using constructor
                          public DefaultCustomerService(CustomerRepository repository) {
                            this.repository = repository;
    }
   */

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

}