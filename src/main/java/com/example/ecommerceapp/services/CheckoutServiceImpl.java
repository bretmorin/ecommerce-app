package com.example.ecommerceapp.services;

import com.example.ecommerceapp.dao.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

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

		//generate tracking number

		//populate cart for each cart item

		//populate customer with order

		//save to the database

		//return a response
		return null;

	}
}
