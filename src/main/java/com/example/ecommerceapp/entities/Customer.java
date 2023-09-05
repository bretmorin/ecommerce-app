package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;
	@NotNull
	private String customer_first_name;
	@NotNull
	private String customer_last_name;
	@NotNull
	private String address;
	@NotNull
	private String postal_code;
	@NotNull
	private String phone;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Division
	@ManyToOne
	@JoinColumn(name = "division_id", nullable = false)
	private Division division;

	//bidirectional to Cart
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private Set<Cart> carts;

	public Customer() {
	}

	public Customer(Long customer_id, String customer_first_name, String customer_last_name, String address, String postal_code, String phone, Date create_date, Date last_update, Division division, Set<Cart> carts) {
		this.customer_id = customer_id;
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.address = address;
		this.postal_code = postal_code;
		this.phone = phone;
		this.create_date = create_date;
		this.last_update = last_update;
		this.division = division;
		this.carts = carts;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_first_name() {
		return customer_first_name;
	}

	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}

	public String getCustomer_last_name() {
		return customer_last_name;
	}

	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	public void add(Cart cart) {
		if (cart != null) {
			if (carts == null) {
				carts = new HashSet<>();
			}

			carts.add(cart);
			cart.setCustomer(this);
		}
	}
}
