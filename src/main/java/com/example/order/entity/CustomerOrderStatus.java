package com.example.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "washorder", name = "t_order_customer_status")
@Setter
@Getter
public class CustomerOrderStatus {

	@Id
	@Column(name = "customer_order_status_id")
	private Long customerOrderStatusId;
	
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "washer_id")
	private Long washerId;
	
	@Column(name = "customer_order_status")
	private String customerWashOrderStatus;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
}
