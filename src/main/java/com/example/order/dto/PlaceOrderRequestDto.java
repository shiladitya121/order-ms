package com.example.order.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlaceOrderRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3093858510504266723L;
	
	private long customerId;
	
	private long carId;
	
	private long packageId;
	
	private double packagePrice;
	
	private long addonId;
	
	private double addonPrice;
	
	private String userNote;

}
