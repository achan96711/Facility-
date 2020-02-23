package com.management.model.employees;

import java.util.ArrayList;

import com.management.model.facilities.Warehouse;

public class WarehouseManager extends ManagementEmployee {

	private ArrayList<Warehouse> facilities = new ArrayList<Warehouse>();
	private int daysInUse;
	
	public void addNewFacility(Warehouse facilityDetail) {
		facilities.add(facilityDetail);
}
	public void removeFacility(String facilityDetail) {
	facilities.remove(facilityDetail);
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

	public double calcUsageRate(int daysInUse) {
	return daysInUse/365;
}

	public void vacateFloor(Warehouse vacatedFacility) {
		for (int i = 0; i <= facilities.size(); i++) {
			if (facilities.get(i).equals(vacatedFacility)) {
				facilities.remove(i);
			}
		}
	}
}
