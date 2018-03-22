package com.diviso.kafka.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.kafka.domain.CustomerLoyalityEvent;
import com.diviso.kafka.service.CustomerLoyalityEventService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoyalityEventResource {
	
	@Autowired
	private CustomerLoyalityEventService customerLoyalityEventService;

	@PostMapping("/loyalityevents/publish")
	public Boolean publishEvent(@RequestBody CustomerLoyalityEvent customerLoyalityEvent) {
		log.info("Loyality event in rest controller "+customerLoyalityEvent);
		return customerLoyalityEventService.publishCutomerLoyalityEvent(customerLoyalityEvent);
		
	}
	
	
	
}
