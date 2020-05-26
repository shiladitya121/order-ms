package com.example.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "washorder", name = "t_wash_order")
@Setter
@Getter
public class WashOrder {

	@Id
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "car_id")
	private Long carId;
	
	@Column(name = "package_id")
	private Long packageId;
	
	@Column(name = "addon_id")
	private Long addonId;
	
	@Column(name = "promocode_id")
	private Long promocodeId;
	
	@Column(name = "total_price")
	private Double totalPrice;
	
	@Column(name = "user_note")
	private String userNote;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
	
}
