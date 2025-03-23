package com.elgatocode.ecommerce.dao;

import com.elgatocode.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);

    // behind the scene this like SQL code: SELECT * FROM Customer c WHERE c.email = theEmailAddress;
}
