package com.microservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.RestaurantCreationResponse;
import com.microservices.dto.RestaurantRequestDTO;
import com.microservices.service.RestaurantService;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

	private final RestaurantService restaurantService;
	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<RestaurantCreationResponse> addRestaurant(@RequestBody RestaurantRequestDTO restaurantRequestDTO){
		System.out.println("RestaurantRequestDTO : " + restaurantRequestDTO );
		RestaurantCreationResponse restaurantCreationResponse	= restaurantService.addRestaurant(restaurantRequestDTO);
		return  ResponseEntity.status(HttpStatus.CREATED).body(restaurantCreationResponse);
	}
	
}







