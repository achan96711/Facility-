package com.management.model.customer;

public interface PaymentI {
	
	public void setCardNumber(int cardNumber);
	public int getCardNumber();
	public void setPaymentType(String paymentType);
	public String getPaymentType();
	public void setPrice(int price);
	public int getPrice();
}
