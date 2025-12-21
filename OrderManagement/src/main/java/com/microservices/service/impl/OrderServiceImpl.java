package com.microservices.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.builder.OrderBuilder;
import com.microservices.builder.OrderDTOBuilder;
import com.microservices.dao.OrderRepository;
import com.microservices.dto.OrderRequestDto;
import com.microservices.dto.OrderResponseDto;
import com.microservices.entity.Orders;
import com.microservices.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private final RestTemplate restTemplate;
	private final OrderRepository orderRepository;
	
	
	public OrderServiceImpl(RestTemplate restTemplate, OrderRepository orderRepository) {
		this.restTemplate = restTemplate;
		this.orderRepository = orderRepository;
	}

	@Override
	public OrderResponseDto placeOrder(OrderRequestDto orderRequest) {
		// TODO Auto-generated method stub
		Orders order = OrderBuilder.buildOrderFromOrderDTO(orderRequest);
		
		Orders saveOrder = orderRepository.save(order);
		
		OrderResponseDto orderResponseDto = OrderDTOBuilder.buildOrderResponseDTOFromOrder(saveOrder);
		
		String name = fetchRestaurantName(saveOrder);
		orderResponseDto.setRestaurantName(name);
		return orderResponseDto;
	}

	@Override
	public OrderResponseDto updateOrderStatus(long orderId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRestaurantName(long restautrantId) {
		// TODO Auto-generated method stub
		
		return null;
	}
    
	public String fetchRestaurantName(Orders order) {
		return restTemplate.getForObject("http://localhost:8001/api/restaurant/name/"+1, String.class);
	}


}


	
