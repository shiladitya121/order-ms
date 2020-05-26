package com.example.order.constant;

public enum CustomerOrderStatusEnum {

	PENDING("Pending"),
	ACCEPT("Accept"),
	INPROGRESS("Inprogress"),
	COMPLETE("Complete"),
	CANCEL("Cancel");
	
	private String value;
	
	private CustomerOrderStatusEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
