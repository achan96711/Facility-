package com.management.model.employees;

import java.util.ArrayList;
import java.util.List;

import com.management.model.facilities.Warehouse;

public class ManagementEmployee extends Employee {

	private ArrayList<Warehouse> facilities = new ArrayList<Warehouse>();
	private ArrayList<String> maintRequests = new ArrayList<String>();
	private double usageRate;
	
	public void addNewFacility(Warehouse facilityDetail) {
		facilities.add(facilityDetail);
	}
	public void removeFacility(String facilityDetail) {
		facilities.remove(facilityDetail);
	}
	//Prints usage of floors
	public void listActualUsage(String facilityName, int floorNumber) {
		System.out.println("Floor " + floorNumber + " is in use in " + facilityName);
	}
	//Calculate usage rate
	public double calcUsageRate(int daysInUse) {
		usageRate = daysInUse/365;
		return usageRate;
	}
	//Uses for loop to remove vacated facility
	public void vacateFloor(Warehouse vacatedFacility) {
		for (int i = 0; i <= facilities.size(); i++) {
			if (facilities.get(i).equals(vacatedFacility)) {
				facilities.remove(i);
			}
		}
	}
	//Takes a boolean for scheduled maintenance
	public boolean scheduleMaintenance(boolean isScheduled) {
		return isScheduled;
	}
	//Finds usage rate
	public double calcDownTimeForFacility(double usageRate) {
		double downTime = 1 - usageRate;
		return downTime;
	}
	//Lists maintenance requests from array list
	public ArrayList<String> listMaintRequest() {
		return maintRequests;
	}
	//Adds maintenance request to array list
	public void makeFacilityMaintRequest(String request) {
		maintRequests.add(request);
		
	}
}
