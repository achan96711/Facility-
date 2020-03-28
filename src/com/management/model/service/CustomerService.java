package com.management.model.service;

import com.management.model.customer.CustomerI;

public class CustomerService {
	
	private CustomerI customer;
	
	public void setCustomer(CustomerI customer) {
	    this.customer = customer;
	  }
	
	public CustomerI getCustomer() {
		return customer;
	}
	
}
