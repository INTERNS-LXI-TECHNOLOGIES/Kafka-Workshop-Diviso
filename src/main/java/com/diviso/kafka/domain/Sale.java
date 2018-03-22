/**

 * 
 */
package com.diviso.kafka.domain;

/**
 * @author vishnu
 *
 */
public class Sale {
	private Long customerId;
	private ProductLine productLine = new ProductLine();
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public ProductLine getProductLine() {
		return productLine;
	}
	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}
}
