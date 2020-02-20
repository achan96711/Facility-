package com.facManage.model.employees;

import java.util.ArrayList;

public interface Maintainer {
	
	public static final String maintPerson = "Jerry";
	public static final String facilityProblem = "Heating/Cooling";
	
	public void vacateFacility();
	
	public ArrayList<String> listInspections();
	
	public ArrayList<String> listMaintRequests();
	
	public ArrayList<String> listMaintenance();
	
	public ArrayList<String> listFacilityProblems();
}
