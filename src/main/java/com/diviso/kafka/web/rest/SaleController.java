package com.diviso.kafka.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.kafka.domain.ProductLine;
import com.diviso.kafka.service.SaleService;

/**
 * REST controller for managing sale
 */
@RestController
@RequestMapping("/api")
public class SaleController {
	
	 private final Logger log = LoggerFactory.getLogger(SaleController.class);
	 
	 private final SaleService saleService;
	 
	 public SaleController(SaleService saleService) {
		 this.saleService = saleService;
	 }
	 
	 @PostMapping("/sale/{customerId}")
	 public boolean salePublish(@RequestBody ProductLine productLine, @PathVariable Long customerId) {
		log.debug("REST request to create sale event by customerId, productLine : {}"+ customerId, productLine);
		
		return saleService.sale(customerId, productLine); 		
	 }

}
