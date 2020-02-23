package com.management.model.customer;

import java.util.List;

public class Customer implements CustomerI {
 private String firstName;
 private String lastName;
 private List<String> floorAssignments;
 
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

public List<String> getFloorsAssignments() {
	return floorAssignments;
}

public void setFloorsAssignments(List<String> floorAssignments) {
	this.floorAssignments = floorAssignments;
}
 
}
