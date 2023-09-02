package com.example.ecommerceapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "divisions")
public class Division {
	private Long division_id;
	private String division;
	private Date create_date;
	private Date last_update;
	private Country country;
	private Long country_id;
	private Set<Customer> customers;

	public Division(Long division_id, String division, Date create_date, Date last_update, Country country, Long country_id, Set<Customer> customers) {
		this.division_id = division_id;
		this.division = division;
		this.create_date = create_date;
		this.last_update = last_update;
		this.country = country;
		this.country_id = country_id;
		this.customers = customers;
	}

	public Long getDivision_id() {
		return division_id;
	}

	public void setDivision_id(Long division_id) {
		this.division_id = division_id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
}
