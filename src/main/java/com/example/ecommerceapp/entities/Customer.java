package com.example.ecommerceapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

	private Long customer_id;
	private String customer_first_name;
	private String customer_last_name;
	private String address;
	private String postal_code;
	private String phone;
	private Date create_date;
	private Date last_update;
	private int division_id;
	private Set<Cart> carts;

	public Customer(Long customer_id, String customer_first_name, String customer_last_name, String address, String postal_code, String phone, Date create_date, Date last_update, int division_id, Set<Cart> carts) {
		this.customer_id = customer_id;
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.address = address;
		this.postal_code = postal_code;
		this.phone = phone;
		this.create_date = create_date;
		this.last_update = last_update;
		this.division_id = division_id;
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

	public int getDivision_id() {
		return division_id;
	}

	public void setDivision_id(int division_id) {
		this.division_id = division_id;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}



}
