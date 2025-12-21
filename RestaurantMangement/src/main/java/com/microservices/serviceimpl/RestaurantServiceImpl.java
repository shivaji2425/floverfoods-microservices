package com.microservices.serviceimpl;

import org.springframework.stereotype.Service;

import com.microservices.builder.RestaurantBuilder;
import com.microservices.builder.RestaurantDTOBuilder;
import com.microservices.dao.RestaurantRepository;
import com.microservices.dto.RestaurantCreationResponse;
import com.microservices.dto.RestaurantRequestDTO;
import com.microservices.dto.RestaurantResponseDTO;
import com.microservices.entity.Restaurant;
import com.microservices.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	private final RestaurantRepository restaurantRepository;
	
	
	public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}
	
	@Override
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDTO restaurantRequestDTO) {
		Restaurant restaurant = RestaurantBuilder.buildRestaurantFromRestaurantDTO(restaurantRequestDTO);
		restaurantRepository.save(restaurant);
		
		return new RestaurantCreationResponse(restaurant.getRestaurantId(),restaurant.getRestaurantName());
	}

	@Override
	public RestaurantResponseDTO getRestaurantById(long restaurantId) {
		Restaurant restaturant = restaurantRepository.findById(restaurantId).orElseThrow(
				() -> new IllegalArgumentException("No restaurant found witt id"));
		return RestaurantDTOBuilder.buildRestaurantDTOFromRestaurant(restaturant);
	}

}










