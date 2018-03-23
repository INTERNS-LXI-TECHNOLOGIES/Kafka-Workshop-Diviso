/**

 * 
 */
package com.diviso.kafka.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vishnu
 *
 */
public class Sale {
	private Long customerId;
	private List<ProductLine> productLine = new ArrayList<ProductLine>();
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public List<ProductLine> getProductLine() {
		return productLine;
	}
	public void setProductLine(List<ProductLine> productLine) {
		this.productLine = productLine;
	}
}
