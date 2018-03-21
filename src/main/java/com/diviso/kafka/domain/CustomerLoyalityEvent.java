package com.diviso.kafka.domain;


public class CustomerLoyalityEvent {

	private Long customerId;
	
	private Long points;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}
	
}
