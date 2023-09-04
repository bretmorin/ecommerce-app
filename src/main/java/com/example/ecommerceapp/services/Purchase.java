package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.Cart;
import com.example.ecommerceapp.entities.CartItem;
import com.example.ecommerceapp.entities.Customer;

import java.util.Set;

public class Purchase {
	private Customer customer;
	private Cart cart;
	private Set<CartItem> cartItems;

	public Purchase() {
	}

	public Purchase(Customer customer, Cart cart, Set<CartItem> cartItems) {
		this.customer = customer;
		this.cart = cart;
		this.cartItems = cartItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
}
