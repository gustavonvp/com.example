package com.example.comexamplerestfulljava.controller;

import com.example.comexamplerestfulljava.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerControllerTest {

    @Autowired
    CustomerController customerController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getCustomer() {
            Customer customer = customerController.getCustomer(new Long("1"));
    }
}