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
	private List<ProductLine> productLines = new ArrayList<ProductLine>();
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public List<ProductLine> getProductLines() {
		return productLines;
	}
	public void setProductLines(List<ProductLine> productLines) {
		this.productLines = productLines;
	}
}
