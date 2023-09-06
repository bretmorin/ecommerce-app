package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "carts")
public interface CartRepository extends JpaRepository<Cart, Long> {

}
