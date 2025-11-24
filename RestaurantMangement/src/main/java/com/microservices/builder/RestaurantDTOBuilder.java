package com.microservices.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.microservices.dto.AddressResponseDto;
import com.microservices.dto.ItemResponseDTO;
import com.microservices.dto.RestaurantResponseDTO;
import com.microservices.entity.Address;
import com.microservices.entity.Item;
import com.microservices.entity.Restaurant;

public class RestaurantDTOBuilder {

	public static RestaurantResponseDTO buildRestaurantDTOFromRestaurant(Restaurant restaurant) {
		
		return RestaurantResponseDTO.builder()
				.restaurantId(restaurant.getRestaurantId())
				.restaurantName(restaurant.getRestaurantName())
				.phoneNum(restaurant.getNumber())
				.rating(restaurant.getRating())
				.addressResponseDto(buildAddressDTOFromAddress(restaurant.getAddress()))
				.itemResponseDtoList(buildItemDTOFromItem(restaurant.getItems()))
				.build();
				
	}
	
	public static AddressResponseDto buildAddressDTOFromAddress(Address address) {
		AddressResponseDto addressDTO = new AddressResponseDto();
		BeanUtils.copyProperties(address, addressDTO);
		return addressDTO;
	}

	public static List<ItemResponseDTO> buildItemDTOFromItem(List<Item> items) {
		List<ItemResponseDTO> itemDTOs = new ArrayList<>();
		for (Item item : items) {
			ItemResponseDTO itemDTO = new ItemResponseDTO();
			BeanUtils.copyProperties(item, itemDTO);
			itemDTOs.add(itemDTO);
		}
		return itemDTOs;
	}
}





