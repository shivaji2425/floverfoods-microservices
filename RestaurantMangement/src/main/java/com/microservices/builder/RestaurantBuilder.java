package com.microservices.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.microservices.dto.AddressRequestDTO;
import com.microservices.dto.ItemRequestDTO;
import com.microservices.dto.RestaurantRequestDTO;
import com.microservices.entity.Address;
import com.microservices.entity.Item;
import com.microservices.entity.Restaurant;

public class RestaurantBuilder {

	public static Restaurant buildRestaurantFromRestaurantDTO(RestaurantRequestDTO restaurantRequestDTO) {

		return Restaurant.builder().restaurantName(restaurantRequestDTO.getRestaurantName())
				.number(restaurantRequestDTO.getNumber())
				.address(buildAddressFromAddressDTO(restaurantRequestDTO.getAddressDTO()))
				.items(buildItemFromItemDTO(restaurantRequestDTO.getItems())).build();
	}

	public static Address buildAddressFromAddressDTO(AddressRequestDTO addressRequestDTO) {
		Address address = new Address();
		BeanUtils.copyProperties(addressRequestDTO, address);
		return address;
	}

	public static List<Item> buildItemFromItemDTO(List<ItemRequestDTO> itemRequestDTOs) {

		List<Item> items = new ArrayList<>();

		for (ItemRequestDTO itemRequestDTO : itemRequestDTOs) {
			Item item = new Item();
			BeanUtils.copyProperties(itemRequestDTO, item);
			items.add(item);
		}
		return items;
	}
	
}