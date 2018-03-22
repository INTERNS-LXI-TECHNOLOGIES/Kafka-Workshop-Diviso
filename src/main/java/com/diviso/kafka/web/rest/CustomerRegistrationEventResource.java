package com.diviso.kafka.web.rest;

import com.diviso.kafka.domain.Customer;
import com.diviso.kafka.service.PublishCustomerEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class CustomerRegistrationEventResource {

    private final Logger log = LoggerFactory.getLogger(CustomerRegistrationEventResource.class);

    PublishCustomerEvent publishCustomerEvent;
    
    public CustomerRegistrationEventResource(PublishCustomerEvent publishCustomerEvent) {
    	this.publishCustomerEvent=publishCustomerEvent;
	}
    /**
     * GET  /authenticate : check if the user is authenticated, and return its login.
     *
     * @param request the HTTP request
     * @return the login if the user is authenticated
     */
    @PostMapping("/Customer")
    public String createCustomer(@RequestBody Customer customer) {
    	
        log.debug("REST request to Create Customer : {}",customer);
        publishCustomerEvent.send(customer);
        return "SuccessFul";
    }

}
