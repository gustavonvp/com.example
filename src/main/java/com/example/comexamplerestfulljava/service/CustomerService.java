package com.example.comexamplerestfulljava.service;

import com.example.comexamplerestfulljava.domain.Customer;
import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);
}
