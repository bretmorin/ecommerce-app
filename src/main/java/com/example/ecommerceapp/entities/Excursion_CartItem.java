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

	public Excursion_CartItem() {
	}

	public Excursion_CartItem(Long id, CartItem cartItem, Excursion excursion) {
		this.id = id;
		this.cartItem = cartItem;
		this.excursion = excursion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	public Excursion getExcursion() {
		return excursion;
	}

	public void setExcursion(Excursion excursion) {
		this.excursion = excursion;
	}
}
