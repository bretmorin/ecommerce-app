package com.example.ecommerceapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "excursion_cartitem")
public class Excursion_CartItem {

	@ManyToOne
	@JoinColumn(name = "cart_item_id")
	private CartItem cart_item_id;

	@ManyToOne
	@JoinColumn(name = "excursion_id")
	private Excursion excursion_id;

	public Excursion_CartItem(CartItem cart_item_id, Excursion excursion_id) {
		this.cart_item_id = cart_item_id;
		this.excursion_id = excursion_id;
	}

	public CartItem getCart_item_id() {
		return cart_item_id;
	}

	public void setCart_item_id(CartItem cart_item_id) {
		this.cart_item_id = cart_item_id;
	}

	public Excursion getExcursion_id() {
		return excursion_id;
	}

	public void setExcursion_id(Excursion excursion_id) {
		this.excursion_id = excursion_id;
	}
}
