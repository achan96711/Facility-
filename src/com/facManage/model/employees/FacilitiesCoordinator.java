package com.facManage.model.employees;

import java.util.ArrayList;

public abstract class FacilitiesCoordinator {

	float usageCost;
	float usageRate;
	float totalCost;
	String facilityInfo;
	String intervalInUse;
	
	ArrayList<String> facilities1 = new ArrayList<String>();
	
	public ArrayList<String> listFacilities(){
		return facilities1;
	}
	
	public String getFacilityInformation() {
		return facilityInfo;
	}
	
	public String isInUseDuringInterval() {
		return intervalInUse;
	}
	
}
