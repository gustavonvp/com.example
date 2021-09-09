package com.example.comexamplerestfulljava.bootstrap;

import com.example.comexamplerestfulljava.domain.Customer;
import com.example.comexamplerestfulljava.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {


    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Michaele");
        c1.setLastname("Weston");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Sam");
        c2.setLastname("Axe");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Fiona");
        c3.setLastname("Glen");

        System.out.println("Customers Saved:" +customerRepository.count());
    }
}
