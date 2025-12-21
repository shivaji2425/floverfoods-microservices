package com.microservices.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.OrderRequestDto;
import com.microservices.dto.OrderResponseDto;
import com.microservices.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/add")
	public ResponseEntity<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto orderRequest){
		OrderResponseDto response = orderService.placeOrder(orderRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
