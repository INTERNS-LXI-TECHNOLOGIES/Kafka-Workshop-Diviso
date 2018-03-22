package com.diviso.kafka.domain;

public class Payment {

	private String status;
	private Double total;
	private Long transactionId;
	private PaymentMethod method;
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public PaymentMethod getMethod() {
		return method;
	}


	public void setMethod(PaymentMethod method) {
		this.method = method;
	}


	enum PaymentMethod{
		CASH, VOUCHER, NET_BANKING, CREDIT_CARD, DEBIT_CARD
	}

}
