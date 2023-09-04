package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "customer", collectionResourceRel = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
