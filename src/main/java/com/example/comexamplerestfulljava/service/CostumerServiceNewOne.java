package com.example.comexamplerestfulljava.service;

import com.example.comexamplerestfulljava.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;


public class CostumerServiceNewOne {
    private String databaseUrl;
    private String user;
    private String password;


    @Autowired
    public CostumerServiceNewOne(String databaseUrl, String user, String password) {
        this.databaseUrl = databaseUrl;
        this.user = user;
        this.password = password;
    }

    public Customer getCustomerFromDB(Long id) {
        System.out.println("Getting Customer from DB...");

        return new Customer();
    }

}
