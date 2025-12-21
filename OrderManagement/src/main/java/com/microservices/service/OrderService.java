package com.microservices.service;

import com.microservices.dto.OrderRequestDto;
import com.microservices.dto.OrderResponseDto;

public interface OrderService {
    
	OrderResponseDto placeOrder(OrderRequestDto orderRequest);
	
	OrderResponseDto updateOrderStatus(long orderId, String status);

	String getRestaurantName(long restautrantId);
}
