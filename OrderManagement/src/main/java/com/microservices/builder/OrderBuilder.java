package com.microservices.builder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.microservices.dto.OrderItemRequestDto;
import com.microservices.dto.OrderRequestDto;
import com.microservices.entity.OrderItem;
import com.microservices.entity.Orders;


public class OrderBuilder {

    public static Orders buildOrderFromOrderDTO(OrderRequestDto orderRequestDto) {
        return Orders.builder()
        	.status("Ordered")
        	.orderPrice(orderRequestDto.getOrderPrice())
        	.userId(orderRequestDto.getUserId())
        	.restaurantId(orderRequestDto.getRestaurantId())
        	.orderItems(buildOrderItemsFromDTO(orderRequestDto.getOrderItems()))
        	.build();
        	
    }
    
    private static List<OrderItem> buildOrderItemsFromDTO(List<OrderItemRequestDto> orderItemRequestDtoList) {
    	List<OrderItem> orderItemsList = new ArrayList<>();
    	
    	for(OrderItemRequestDto orderItemRequestDto : orderItemRequestDtoList) {
    		OrderItem orderItem = new OrderItem();
    		BeanUtils.copyProperties(orderItemRequestDto, orderItem);
    		orderItemsList.add(orderItem);
    	}
    	return orderItemsList;
    }

}

