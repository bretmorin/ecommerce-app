package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cart_items")
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_item_id;

	@ManyToMany
	@JoinTable(name = "excursion_cartitem",
			joinColumns = @JoinColumn(name = "cart_item_id"),
			inverseJoinColumns = @JoinColumn(name = "excursion_id"))
	private Set<Excursion> excursions;

	//unidirectional to Vacation entity
	@ManyToOne
	@JoinColumn(name = "vacation_id", nullable = false)
	private Vacation vacation;

	//bidirectional to Cart entity
	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = false)
	private Cart cart;

	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	public CartItem() {

	}

	public CartItem(Long cart_item_id, Set<Excursion> excursions, Vacation vacation, Cart cart, Date create_date, Date last_update) {
		this.cart_item_id = cart_item_id;
		this.excursions = excursions;
		this.vacation = vacation;
		this.cart = cart;
		this.create_date = create_date;
		this.last_update = last_update;
	}

	public Long getCart_item_id() {
		return cart_item_id;
	}

	public void setCart_item_id(Long cart_item_id) {
		this.cart_item_id = cart_item_id;
	}

	public Set<Excursion> getExcursions() {
		return excursions;
	}

	public void setExcursions(Set<Excursion> excursions) {
		this.excursions = excursions;
	}

	public Vacation getVacation() {
		return vacation;
	}

	public void setVacation(Vacation vacation) {
		this.vacation = vacation;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
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
}
