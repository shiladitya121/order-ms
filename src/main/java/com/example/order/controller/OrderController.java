package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.dto.PlaceOrderRequestDto;
import com.example.order.service.OrderService;

@RestController
@RequestMapping("/api/order/v1")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(path = "/placeorder", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> placeOrder(@RequestBody PlaceOrderRequestDto requestDto){
		orderService.placeOrder(requestDto);
		return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
	}
}
