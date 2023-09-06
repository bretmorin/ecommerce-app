package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carts")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_id;

	@Column(name = "order_tracking_number")
	private String orderTrackingNumber;

	private Long package_price;

	private int party_size;

	private StatusType status;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Customer
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	//bidirectional to CartItem entity
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private Set<CartItem> cartItems;

	public Cart() {
	}

	//add method
	public void add(CartItem cartItem) {
		if (cartItem != null) {
			if (cartItems == null) {
				cartItems = new HashSet<>();
			}

			cartItems.add(cartItem);
			cartItem.setCart(this);
		}
	}

	public Cart(Long cart_id, String orderTrackingNumber, Long package_price, int party_size, StatusType status, Date create_date, Date last_update, Customer customer, Set<CartItem> cartItems) {
		this.cart_id = cart_id;
		this.orderTrackingNumber = orderTrackingNumber;
		this.package_price = package_price;
		this.party_size = party_size;
		this.status = status;
		this.create_date = create_date;
		this.last_update = last_update;
		this.customer = customer;
		this.cartItems = cartItems;
	}

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public Long getPackage_price() {
		return package_price;
	}

	public void setPackage_price(Long package_price) {
		this.package_price = package_price;
	}

	public int getParty_size() {
		return party_size;
	}

	public void setParty_size(int party_size) {
		this.party_size = party_size;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
}
