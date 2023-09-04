package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long country_id;
	private String country;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Division
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private Set<Division> division;

	public Country() {
	}

	public Country(Long country_id, String country, Date create_date, Date last_update, Set<Division> division) {
		this.country_id = country_id;
		this.country = country;
		this.create_date = create_date;
		this.last_update = last_update;
		this.division = division;
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

	public Set<Division> getDivision() {
		return division;
	}

	public void setDivision(Set<Division> division) {
		this.division = division;
	}
}
