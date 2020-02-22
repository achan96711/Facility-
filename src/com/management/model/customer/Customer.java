package com.management.model.customer;

public class Customer implements CustomerI {
 private String firstName;
 private String lastName;
 private String facilityAssignment;
 
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
 
 public String getFacilityAssigned() {
	 return facilityAssignment;
 }
 
 public void setFacilityAssigned (String facilityAssignment) {
	 this.facilityAssignment = facilityAssignment;
 }
 
}
