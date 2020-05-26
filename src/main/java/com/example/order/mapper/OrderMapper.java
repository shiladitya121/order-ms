package com.example.order.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.order.constant.CustomerOrderStatusEnum;
import com.example.order.dto.PlaceOrderRequestDto;
import com.example.order.entity.CustomerOrderStatus;
import com.example.order.entity.WashOrder;
import com.example.order.utils.IdGenerator;

@Component
public class OrderMapper {

	public WashOrder convertWashOrderDtoToEntity(PlaceOrderRequestDto placeOrderRequestDto, double totalPrice) {
		WashOrder washOrder = new WashOrder();
		washOrder.setOrderId(IdGenerator.nextId());
		washOrder.setCarId(placeOrderRequestDto.getCarId());
		washOrder.setPackageId(placeOrderRequestDto.getPackageId());
		washOrder.setAddonId(placeOrderRequestDto.getAddonId());
		washOrder.setPromocodeId(null);
		washOrder.setTotalPrice(totalPrice);
		washOrder.setUserNote(placeOrderRequestDto.getUserNote());
		washOrder.setCreatedOn(new Date());
		washOrder.setModifiedOn(new Date());
		return washOrder;
	}

	public CustomerOrderStatus convertCustOrderStatusDtoToEntity(Long orderId, long customerId) {
		CustomerOrderStatus customerOrderStatus = new CustomerOrderStatus();
		customerOrderStatus.setCustomerOrderStatusId(IdGenerator.nextId());
		customerOrderStatus.setOrderId(orderId);
		customerOrderStatus.setCustomerId(customerId);
		customerOrderStatus.setWasherId(null);
		customerOrderStatus.setCustomerWashOrderStatus(CustomerOrderStatusEnum.PENDING.getValue());
		customerOrderStatus.setCreatedOn(new Date());
		customerOrderStatus.setModifiedOn(new Date());
		return customerOrderStatus;
	}

	
}
