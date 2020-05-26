package com.example.order.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dto.PlaceOrderRequestDto;
import com.example.order.entity.CustomerOrderStatus;
import com.example.order.entity.WashOrder;
import com.example.order.mapper.OrderMapper;
import com.example.order.repository.CustomerOrderStatusRepository;
import com.example.order.repository.WashOrderRepository;
import com.example.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private WashOrderRepository washOrderRepository;
	
	@Autowired
	private CustomerOrderStatusRepository customerOrderStatusRepository;
	
	@Override
	@Transactional
	public void placeOrder(PlaceOrderRequestDto placeOrderRequestDto) {
		double totalPrice = calculateTotalPrice(placeOrderRequestDto.getPackagePrice(),
				placeOrderRequestDto.getAddonPrice());
		WashOrder washOrder = orderMapper.convertWashOrderDtoToEntity(placeOrderRequestDto, totalPrice);
		washOrderRepository.save(washOrder);
		CustomerOrderStatus customerOrderStatus = orderMapper.convertCustOrderStatusDtoToEntity(
				washOrder.getOrderId(), placeOrderRequestDto.getCustomerId());
		customerOrderStatusRepository.save(customerOrderStatus);
	}

	private double calculateTotalPrice(double packagePrice, double addonPrice) {
		return packagePrice+addonPrice;
	}

}
