package com.diviso.kafka.service;


import org.springframework.cloud.stream.annotation.StreamListener;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.diviso.kafka.domain.Customer;
import com.diviso.kafka.stream.CustomerStream;


@Component
public class CustomerListener{

	@StreamListener(CustomerStream.TOPIC1)
	public void getMessages(@Payload Customer customer){
		
		System.out.println("Name    : "+customer.getName()+"\nContact : "+customer.getContactNo()+"\n");

	}

}
