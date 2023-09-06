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
	@Column(name = "travel_fare_price")
	private Long travel_price;
	@Column(name = "image_url")
	private String image_URL;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date last_update;

	//bidirectional to Excursion entity
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
	private Set<Excursion> excursions;

	public Vacation() {
	}

	public Vacation(Long vacation_id, String vacation_title, String description, Long travel_price, String image_URL, Date create_date, Date last_update, Set<Excursion> excursions) {
		this.vacation_id = vacation_id;
		this.vacation_title = vacation_title;
		this.description = description;
		this.travel_price = travel_price;
		this.image_URL = image_URL;
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

	public Long getTravel_price() {
		return travel_price;
	}

	public void setTravel_price(Long travel_price) {
		this.travel_price = travel_price;
	}

	public String getImage_URL() {
		return image_URL;
	}

	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
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
