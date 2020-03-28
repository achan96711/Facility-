package com.management.model.customer;

import java.util.List;

import com.management.model.customer.AddressI;

public class Customer implements CustomerI {
 private String firstName;
 private String lastName;
 private List<String> floorAssignments;
 private Address facilityAddress;
 private int cardNumber;
 
 public String getFirstName() {
	 return firstName;
 }
 
 public void setFirstName(String firstName) {
	 this.firstName = firstName;
 }
 
 public String getLastName() {
	 return lastName;
 }
 
 public void setLastName(String lastName) {
	 this.lastName = lastName;
 }
/*
public List<String> getFloorsAssignments() {
	return floorAssignments;
}
*/
public void setFloorsAssignments(List<String> floorAssignments) {
	this.floorAssignments = floorAssignments;
}
@Override
public AddressI getFacilityAddress() {
	return facilityAddress;
}
@Override
public void setFacilityAddress(AddressI facilityAddress) {
	this.facilityAddress = (Address) facilityAddress;
	
}

@Override
public String getCustomerId() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setCustomerId(String id) {
	// TODO Auto-generated method stub
	
}
}
