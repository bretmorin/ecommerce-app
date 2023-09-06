package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "divisions")
public class Division {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "division_id")
	private Long id;
	@Column(name = "division")
	private String division_name;

	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Country
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
	private Country country;

	//bidirectional to Customer
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
	private Set<Customer> customers;

	@Column(name="country_id")
	private long country_id;

	//add method
	public void add(Customer customer) {
		if (customer != null) {
			if (customers == null) {
				customers = new HashSet<>();
			}
			customers.add(customer);
			customer.setDivision(this);
		}
	}

	public Division() {
	}

	public Division(Long id, String division_name, Date create_date, Date last_update, Country country, Set<Customer> customers, long country_id) {
		this.id = id;
		this.division_name = division_name;
		this.create_date = create_date;
		this.last_update = last_update;
		this.country = country;
		this.customers = customers;
		this.country_id = country_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDivision_name() {
		return division_name;
	}

	public void setDivision_name(String division_name) {
		this.division_name = division_name;
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
		setCountry_id(country.getId());
		this.country = country;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}
}
