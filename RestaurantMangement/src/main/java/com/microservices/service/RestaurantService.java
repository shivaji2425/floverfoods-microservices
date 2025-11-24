package com.microservices.service;

import com.microservices.dto.RestaurantCreationResponse;
import com.microservices.dto.RestaurantRequestDTO;

public interface RestaurantService {

//	RestuarantCreationResponse addRestaurant(Resta)
	
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDTO restaurantRequestDTO);
}
