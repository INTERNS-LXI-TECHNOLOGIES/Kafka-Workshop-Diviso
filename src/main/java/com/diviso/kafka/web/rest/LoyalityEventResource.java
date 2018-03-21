package com.diviso.kafka.web.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.kafka.domain.CustomerLoyalityEvent;

@RestController("/api")
public class LoyalityEventResource {

	public void publishEvent(@RequestBody CustomerLoyalityEvent loyalityEvent) {
		
		
		
	}
	
	
	
}
