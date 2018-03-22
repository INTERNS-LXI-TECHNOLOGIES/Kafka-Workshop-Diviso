/**
 * 
 */
package com.diviso.kafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.kafka.domain.ProductLine;
import com.diviso.kafka.domain.Sale;

import com.diviso.kafka.service.SaleService;
import com.diviso.kafka.stream.MessageStream;
import com.diviso.kafka.web.rest.SaleController;

/**
 * @author vishnu
 *
 */
@Service
public class SaleServiceImpl implements SaleService {
	
	 private final Logger log = LoggerFactory.getLogger(SaleServiceImpl.class);
	
	private final MessageStream messageStream;
	
	public SaleServiceImpl(MessageStream messageStream) {
		this.messageStream = messageStream;
	}
	
	public boolean sale(Long customerId, ProductLine productLine) {
		log.debug("REST request to create sale event by customerId, productLine : {}"+ customerId, productLine);
		log.info(" "+productLine.getProductName()+productLine.getProductId());
		
		Sale sale = new Sale();
		sale.setCustomerId(customerId);
		sale.setProductLine(productLine);
		
		MessageChannel messageChannel = messageStream.getSaleOutputStream();
		return messageChannel.send(
				MessageBuilder.withPayload(sale)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
	}

}
