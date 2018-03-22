/**
 * 
 */
package com.diviso.kafka.service;

import com.diviso.kafka.domain.ProductLine;
import com.diviso.kafka.domain.Sale;

/**
 * @author vishnu
 *
 */
public interface SaleService {
	public abstract boolean sale(Long customerId, ProductLine productLine);

}
