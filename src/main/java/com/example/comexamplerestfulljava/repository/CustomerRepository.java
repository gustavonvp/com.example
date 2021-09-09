package com.example.comexamplerestfulljava.repository;

import com.example.comexamplerestfulljava.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
