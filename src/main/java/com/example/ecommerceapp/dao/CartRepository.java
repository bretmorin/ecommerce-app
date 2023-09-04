package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cart", collectionResourceRel = "cart")
public interface CartRepository extends JpaRepository<Cart, Long> {

}