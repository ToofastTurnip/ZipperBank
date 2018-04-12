package io.zipcoder.bank.controller;

import io.zipcoder.bank.model.Customer;
import io.zipcoder.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Customer>> getAccount() {
        Collection<Customer> accounts = customerService.findAllCustomers();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> findAccountById(@PathVariable("id") Integer id) {
        Customer account = customerService.findCustomerById(id);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> createAccount(@RequestBody Customer account) {
        Customer savedAccount = customerService.createCustomer(account);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateAccountById(@RequestBody Customer account, @PathVariable("id") Integer id) {
        Customer returnAccount = customerService.updateCustomerById(id, account);
        return new ResponseEntity<>(returnAccount, HttpStatus.OK);
    }

    //Need Get customer that owns the specified account
    //findCustomerByAccount(/accounts/{accountId}/customer

}
