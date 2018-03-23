/**
 * 
 */
package com.diviso.kafka.service;

import java.util.List;

import com.diviso.kafka.domain.ProductLine;
import com.diviso.kafka.domain.Sale;

/**
 * @author vishnu
 *
 */
public interface SaleService {
	public abstract boolean sale(Long customerId, List<ProductLine> productLine);

}
