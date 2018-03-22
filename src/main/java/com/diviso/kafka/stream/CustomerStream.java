package com.diviso.kafka.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerStream {

	static final String TOPIC2="registrationoutput";
	
	@Output(TOPIC2)
	MessageChannel write();
	
}
