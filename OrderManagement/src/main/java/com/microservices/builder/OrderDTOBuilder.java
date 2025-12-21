package com.microservices.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.microservices.dto.OrderItemResponseDto;
import com.microservices.dto.OrderResponseDto;
import com.microservices.entity.OrderItem;
import com.microservices.entity.Orders;

public class OrderDTOBuilder {
	

	public static OrderResponseDto buildOrderResponseDTOFromOrder(Orders order) {
		
		return OrderResponseDto.builder()
			   .orderId(order.getOrderId())
			   .status(order.getStatus())
			   .orderPrice(order.getOrderPrice())
			   .orderItems(buildOrderitemsResponseDto(order.getOrderItems())).build();
	}
	
	public static List<OrderItemResponseDto> buildOrderitemsResponseDto(List<OrderItem> items){
		
		List<OrderItemResponseDto> itemList = new ArrayList<>();
		for(OrderItem item : items) {
			OrderItemResponseDto response = new OrderItemResponseDto();
			BeanUtils.copyProperties(item, response);
			itemList.add(response);
			
		}
		return itemList;
	}
}









