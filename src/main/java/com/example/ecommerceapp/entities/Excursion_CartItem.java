package com.example.ecommerceapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "excursion_cartitem")
public class Excursion_CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//Junction to CartItem
	@ManyToOne
	@JoinColumn(name = "cart_item_id", nullable = false)
	private CartItem cartItem;

	//Junction to Excursion
	@ManyToOne
	@JoinColumn(name = "excursion_id", nullable = false)
	private Excursion excursion;

}
