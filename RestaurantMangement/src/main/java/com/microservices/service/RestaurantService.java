package com.microservices.service;

import com.microservices.dto.RestaurantCreationResponse;
import com.microservices.dto.RestaurantRequestDTO;
import com.microservices.dto.RestaurantResponseDTO;

public interface RestaurantService {

//	RestuarantCreationResponse addRestaurant(Resta)
	
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDTO restaurantRequestDTO);
	
	RestaurantResponseDTO getRestaurantById(long restaurantId);
}
