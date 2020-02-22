package com.management.model.employees;

import java.util.ArrayList;


public class FacilitySecretary extends Employee {

	private ArrayList<String> facilities = new ArrayList<String>();
	
	public void addNewfacility(String facName) {
		facilities.add(facName);
	}
	public void removeFacility(String r) {
		facilities.remove(r);
	}
	
	public void assignFacilityToUse(String facilities) {
		Customer.setFacilityAssigned(facilities);
	}
}
