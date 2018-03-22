package com.diviso.kafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.kafka.domain.Payment;
import com.diviso.kafka.service.PaymentService;
import com.diviso.kafka.stream.MessageStream;


@Service
public class PaymentServiceImpl implements PaymentService {

	private final Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);

	private final MessageStream messageStream;

	public PaymentServiceImpl(MessageStream messageStream) {
		this.messageStream = messageStream;
	}

	@Override
	public boolean save(Payment payment) {
		log.debug("Rest request to create a Payment: {} ", payment);

		MessageChannel messageChannel = messageStream.getPaymentOutputStream();
		return messageChannel.send(MessageBuilder.withPayload(payment).setHeader(MessageHeaders.CONTENT_TYPE,
				MimeTypeUtils.APPLICATION_JSON).build());
	}

}
