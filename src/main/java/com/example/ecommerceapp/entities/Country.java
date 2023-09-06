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
	@Column(name = "country_id")
	private Long id;
	@Column(name = "country")
	private String country_name;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Division
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private Set<Division> division;

	public Country() {
	}

	public Country(Long id, String country_name, Date create_date, Date last_update, Set<Division> division) {
		this.id = id;
		this.country_name = country_name;
		this.create_date = create_date;
		this.last_update = last_update;
		this.division = division;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
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
