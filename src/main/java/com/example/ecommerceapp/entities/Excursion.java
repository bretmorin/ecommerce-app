package com.example.ecommerceapp.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "excursions")
public class Excursion {
	private Long excursion_id;
	private String excursion_title;
	private Long excursion_price;
	private String image_url;
	private Date create_date;
	private Date last_update;

	@ManyToOne
	@JoinColumn(name = "vacation_id", nullable = false)
	private Vacation vacation_id;

	@ManyToMany
	@JoinTable(name = "excursion_cartitem",
			joinColumns = @JoinColumn(name = "excursion_id"),
			inverseJoinColumns = @JoinColumn(name = "cart_item_id"))
	private Set<CartItem> cartitems;

	public Excursion(Long excursion_id, String excursion_title, Long excursion_price, String image_url, Date create_date, Date last_update, Vacation vacation_id, Set<CartItem> cartitems) {
		this.excursion_id = excursion_id;
		this.excursion_title = excursion_title;
		this.excursion_price = excursion_price;
		this.image_url = image_url;
		this.create_date = create_date;
		this.last_update = last_update;
		this.vacation_id = vacation_id;
		this.cartitems = cartitems;
	}

	public Long getExcursion_id() {
		return excursion_id;
	}

	public void setExcursion_id(Long excursion_id) {
		this.excursion_id = excursion_id;
	}

	public String getExcursion_title() {
		return excursion_title;
	}

	public void setExcursion_title(String excursion_title) {
		this.excursion_title = excursion_title;
	}

	public Long getExcursion_price() {
		return excursion_price;
	}

	public void setExcursion_price(Long excursion_price) {
		this.excursion_price = excursion_price;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
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

	public Vacation getVacation_id() {
		return vacation_id;
	}

	public void setVacation_id(Vacation vacation_id) {
		this.vacation_id = vacation_id;
	}

	public Set<CartItem> getCartitems() {
		return cartitems;
	}

	public void setCartitems(Set<CartItem> cartitems) {
		this.cartitems = cartitems;
	}
}
