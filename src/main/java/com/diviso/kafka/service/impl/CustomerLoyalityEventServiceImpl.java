package com.diviso.kafka.service.impl;

import org.springframework.messaging.MessageChannel;



import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.kafka.domain.CustomerLoyalityEvent;
import com.diviso.kafka.service.CustomerLoyalityEventService;
import com.diviso.kafka.stream.MessageStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class CustomerLoyalityEventServiceImpl implements CustomerLoyalityEventService {

	private MessageStream messageStream;
	
public  CustomerLoyalityEventServiceImpl(MessageStream messageStream) {
	// TODO Auto-generated constructor stub
	
	this.messageStream=messageStream;
}
	
	

@Override
public Boolean publishCutomerLoyalityEvent(CustomerLoyalityEvent customerLoyalityEvent) {
	MessageChannel messageChannel=messageStream.getLoyalityOutputStream();
	log.info("loyality event in service "+customerLoyalityEvent);
	return messageChannel.send(
			MessageBuilder.withPayload(customerLoyalityEvent)
			.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
			) ;
}

}
