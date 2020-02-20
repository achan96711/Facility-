package com.facManage.model.employees;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class FacilitiesManager {
	float downTime;
	float usageRate;
	double problemRate;
	float maintenanceCost;
	int maintenanceRequests;
	
	ArrayList<String> facilities = new ArrayList<String>();
	
	public void addNewFacility(String facName) {
		facilities.add(facName);
	}
	
	public void removeFacility(int index) {
		facilities.remove(index);
	}
	
	public double calcProblemRateForFacility(int id) {
		float rate = maintenanceRequests / 100;
		return rate;
	}
	
	public float calcDownTimeForFacility() {
		downTime = 100 - usageRate;
		return downTime;
	}
	
	public float calcMaintenanceCostForFacility() {
		maintenanceCost = maintenanceRequests * 100;
		return maintenanceCost;
	}
}

