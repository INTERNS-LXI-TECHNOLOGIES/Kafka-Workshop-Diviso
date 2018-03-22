package com.diviso.kafka.service.impl;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.kafka.domain.Customer;
import com.diviso.kafka.service.CustomerService;
import com.diviso.kafka.stream.CustomerStream;

@Service
public class CustomerServiceImpl implements CustomerService{

		public CustomerServiceImpl(CustomerStream customerStream) {
			this.customerStream = customerStream;
		}

		CustomerStream customerStream;
		
		public void send(Customer customer) {
			System.out.println("JSON Builded");
			customerStream.write().send(MessageBuilder.withPayload(customer)
					.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
		}
		
}
