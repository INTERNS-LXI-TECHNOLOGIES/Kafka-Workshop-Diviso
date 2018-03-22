package com.diviso.kafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerStream {

	static final String TOPIC2="registrationoutput";
	static final String TOPIC1="registrationoutput";
	
	@Output(TOPIC2)
	MessageChannel write();
	
	@Input(TOPIC1)
	SubscribableChannel read();
}
