package com.microservices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequestDTO {

	private String itemName;
	private String itemCategory;
	private String itemType;
	private double itemPrice;
	private double itemRating;
	private boolean isItemAvailable;
}

