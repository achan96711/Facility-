package com.management.model.customer;

public interface CustomerI {
	
	public AddressI getFacilityAddress();
	public void setFacilityAddress(AddressI facilityAddress);
	public String getCustomerId();
	public void setCustomerId(String id);
	public String getLastName();
	public void setLastName(String lastName);
	public String getFirstName();
	public void setFirstName(String firstName);
}
