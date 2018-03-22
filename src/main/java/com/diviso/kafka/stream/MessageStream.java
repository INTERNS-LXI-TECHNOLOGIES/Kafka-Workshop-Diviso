package com.diviso.kafka.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStream {

	String LOYALITYOUTPUT="loyalityoutput";
	
	String SALEOUTPUT="saleoutput";
	
	String REGISTRATIONOUTPUT="registrationoutput";
	
	String PAYMENTOUTPUT="paymentoutput";
	
	@Output(LOYALITYOUTPUT)
	MessageChannel getLoyalityOutputStream();
	
	@Output(SALEOUTPUT)
	MessageChannel getSaleOutputStream();
	
	@Output(REGISTRATIONOUTPUT)
	MessageChannel getRegistrationOutputStream();
	
	@Output(PAYMENTOUTPUT)
	MessageChannel getPaymentOutputStream();
}
