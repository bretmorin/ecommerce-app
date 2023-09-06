package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
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
	@Column(name = "customer_id")
	private Long id;

	@Column(name = "customer_first_name")
	private String firstName;

	@Column(name = "customer_last_name")
	private String lastName;

	private String address;

	private String postal_code;

	private String phone;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Division
	@ManyToOne
	@JoinColumn(name = "division_id")
	private Division division;

	//bidirectional to Cart
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private Set<Cart> carts;

	public Customer() {
	}

	//add method
	public void add(Cart cart) {
		if (cart != null) {
			if (carts == null) {
				carts = new HashSet<>();
			}

			carts.add(cart);
			cart.setCustomer(this);
		}
	}

	public Customer(Long id, String firstName, String lastName, String address, String postal_code, String phone, Date create_date, Date last_update, Division division, Set<Cart> carts) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postal_code = postal_code;
		this.phone = phone;
		this.create_date = create_date;
		this.last_update = last_update;
		this.division = division;
		this.carts = carts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
}
