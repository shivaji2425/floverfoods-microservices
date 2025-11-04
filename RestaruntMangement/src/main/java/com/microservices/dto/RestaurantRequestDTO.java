package com.microservices.dto;

import java.util.List;

import com.microservices.entity.Address;
import com.microservices.entity.Item;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantRequestDTO {
    
	@Size(min = 3, message = "Building name must be atleast 5 characters")
	private String restaurantName;
	
	private String number;
	
	private AddressRequestDTO address;
	
	private List<ItemRequestDTO> items;
}








