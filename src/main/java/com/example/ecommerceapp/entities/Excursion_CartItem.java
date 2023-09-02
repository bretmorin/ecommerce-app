package com.example.ecommerceapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "excursion_cartitem")
public class Excursion_CartItem {
	private Long excursion_id;
	private Long cart_item_id;

	public Excursion_CartItem(Long excursion_id, Long cart_item_id) {
		this.excursion_id = excursion_id;
		this.cart_item_id = cart_item_id;
	}

	public Long getExcursion_id() {
		return excursion_id;
	}

	public void setExcursion_id(Long excursion_id) {
		this.excursion_id = excursion_id;
	}

	public Long getCart_item_id() {
		return cart_item_id;
	}

	public void setCart_item_id(Long cart_item_id) {
		this.cart_item_id = cart_item_id;
	}
}
