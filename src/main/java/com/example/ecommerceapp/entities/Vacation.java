package com.example.ecommerceapp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vacations")
public class Vacation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vacation_id;
	private String vacation_title;
	private String description;
	private Long travel_fare_price;
	private String image_url;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Excursion entity
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
	private Set<Excursion> excursions;

	public Vacation() {
	}

	public Vacation(Long vacation_id, String vacation_title, String description, Long travel_fare_price, String image_url, Date create_date, Date last_update, Set<Excursion> excursions) {
		this.vacation_id = vacation_id;
		this.vacation_title = vacation_title;
		this.description = description;
		this.travel_fare_price = travel_fare_price;
		this.image_url = image_url;
		this.create_date = create_date;
		this.last_update = last_update;
		this.excursions = excursions;
	}

	public Long getVacation_id() {
		return vacation_id;
	}

	public void setVacation_id(Long vacation_id) {
		this.vacation_id = vacation_id;
	}

	public String getVacation_title() {
		return vacation_title;
	}

	public void setVacation_title(String vacation_title) {
		this.vacation_title = vacation_title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTravel_fare_price() {
		return travel_fare_price;
	}

	public void setTravel_fare_price(Long travel_fare_price) {
		this.travel_fare_price = travel_fare_price;
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

	public Set<Excursion> getExcursions() {
		return excursions;
	}

	public void setExcursions(Set<Excursion> excursions) {
		this.excursions = excursions;
	}
}
