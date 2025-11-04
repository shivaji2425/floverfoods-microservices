package com.microservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private long itemId;
	private String itemName;
	private String itemCategory;
	private String itemType;
	private double itemPrice;
	private double itemRating;
	private boolean isItemAvailable;
	
	
	public Item(String itemName, String itemCategory, String itemType, double itemPrice, double itemRating,
			boolean isItemAvailable) {
		super();
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemRating = itemRating;
		this.isItemAvailable = isItemAvailable;
	}
	
	
	
	
	
	
}
