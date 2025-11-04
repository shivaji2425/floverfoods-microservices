package com.microservices.dto;

import java.util.List;

import com.microservices.entity.Address;
import com.microservices.entity.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantResponseDTO {

	private String message = "Restaurant Created";
	private String restaurantName;
	private String number;
	
	private Address address;
	
	private List<Item> items;
	
	
}



