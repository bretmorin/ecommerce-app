package com.example.ecommerceapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
	private Long country_id;
	private String country;
	private Date create_date;
	private Date last_update;
	private Set<Division> divisions;

	public Country(Long country_id, String country, Date create_date, Date last_update, Set<Division> divisions) {
		this.country_id = country_id;
		this.country = country;
		this.create_date = create_date;
		this.last_update = last_update;
		this.divisions = divisions;
	}

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public Set<Division> getDivisions() {
		return divisions;
	}

	public void setDivisions(Set<Division> divisions) {
		this.divisions = divisions;
	}
}
