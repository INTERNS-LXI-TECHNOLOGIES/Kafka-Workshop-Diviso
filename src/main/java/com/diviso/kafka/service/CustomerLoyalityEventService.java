package com.diviso.kafka.service;

import com.diviso.kafka.domain.CustomerLoyalityEvent;

public interface CustomerLoyalityEventService {

	public Boolean publishCutomerLoyalityEvent(CustomerLoyalityEvent customerLoyalityEvent);
	
}
