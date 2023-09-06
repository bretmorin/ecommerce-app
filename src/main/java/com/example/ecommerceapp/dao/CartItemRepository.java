package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "cart_items")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
