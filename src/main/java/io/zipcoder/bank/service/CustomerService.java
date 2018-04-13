package io.zipcoder.bank.service;

import io.zipcoder.bank.model.Account;
import io.zipcoder.bank.model.Customer;
import io.zipcoder.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Collection<Customer> findAllCustomers() {
        return (Collection<Customer>) customerRepository.findAll();
    }

    public Customer findCustomerById(Integer id) {
        return customerRepository.findOne(id);
    }

    public Customer updateCustomerById(Integer id, Customer customer) {
        customer.setId(id);
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id) {
        customerRepository.delete(id);
    }

//    public Customer findCustomerByAccount(Account account) {
//        return customerRepository.findOne(account);
//    }


}
