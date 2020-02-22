package com.management.model.employees;

import java.util.ArrayList;

public class WarehouseManager {

	private ArrayList<String> facilities = new ArrayList<String>();
	private int daysInUse;
	
public void addNewfacility(String facName) {
	facilities.add(facName);
}
public void removeFacility(String r) {
	facilities.remove(r);
}

public int getDaysInUse() {
	return daysInUse;
}

public void setDaysInUse(int daysInUse) {
	this.daysInUse = daysInUse;
}


public void listActualUsage(int daysInUse) {
	System.out.println("In use for " + daysInUse + " days.");
}

public double calculateUsageRate(int daysInUse) {
	double usageRate = daysInUse/365;
	return usageRate;
}

public String setFacilityAssigned(String vacate) {
	return "Empty";
}
public void vacateFacility(String vacatedFacility) {
	setFacilityAssigned(vacatedFacility);
}


	
}
