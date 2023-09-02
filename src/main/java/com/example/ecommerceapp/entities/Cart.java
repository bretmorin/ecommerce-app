package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "carts")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_id;

	private String order_tracking_number;

	private Long package_price;

	private int party_size;

	private StatusType status;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	private Customer customer_id;

	//bidirectional to CartItem entity
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private Set<CartItem> cartItems;


}
