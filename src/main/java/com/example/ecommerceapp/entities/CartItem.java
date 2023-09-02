package com.example.ecommerceapp.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cart_items")
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_item_id;
	private Set<Excursion> excursions;

	//unidirectional to Vacation entity
	@ManyToOne
	@JoinColumn(name = "vacation_id", nullable = false)
	private Vacation vacation;

	//bidirectional to Cart entity
	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = false)
	private Cart cart;
	private Date create_date;
	private Date last_update;


}
