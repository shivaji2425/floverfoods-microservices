package com.microservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.RestaurantCreationResponse;
import com.microservices.dto.RestaurantRequestDTO;
import com.microservices.dto.RestaurantResponseDTO;
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
		return ResponseEntity.status(HttpStatus.CREATED).body(restaurantCreationResponse);
	}
	
	@GetMapping("/{restaurantId}")
	public ResponseEntity<RestaurantResponseDTO> getRestaurantById(@PathVariable(name = "restaurantId") long restaurantId){
         	 RestaurantResponseDTO restaurantResponseDTO = restaurantService.getRestaurantById(restaurantId);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDTO);
		
	} 
	@GetMapping("/name/{restaurantId}")
	public ResponseEntity<String> getRestaurantName(@PathVariable(name = "restaurantId") long restaurantId){
         	 RestaurantResponseDTO restaurantResponseDTO = restaurantService.getRestaurantById(restaurantId);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDTO.getRestaurantName());
		
	} 
}














