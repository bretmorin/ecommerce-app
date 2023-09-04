package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cart-items", collectionResourceRel = "cart-items")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
