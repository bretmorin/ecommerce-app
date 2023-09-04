package com.example.ecommerceapp.services;

import com.example.ecommerceapp.dao.CustomerRepository;
import com.example.ecommerceapp.entities.Cart;
import com.example.ecommerceapp.entities.CartItem;
import com.example.ecommerceapp.entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

	private CustomerRepository customerRepository;

	public CheckoutServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		//retrieve the order info from services
		Cart cart = purchase.getCart();

		//generate tracking number
		String orderTrackingNumber = generateOrderTrackingNumber();
		cart.setOrder_tracking_number(orderTrackingNumber);

		//populate cart for each cart item
		Set<CartItem> cartItems = purchase.getCartItems();
		cartItems.forEach(item -> cart.add(item));

		//populate customer with cart
		Customer customer = purchase.getCustomer();
		customer.add(cart);

		//save to the database
		customerRepository.save(customer);

		//return a response
		return new PurchaseResponse(orderTrackingNumber);

	}

	private String generateOrderTrackingNumber() {
		//generate a random UUID (UUID: version 4)
		return UUID.randomUUID().toString();
	}
}
