package com.management.model.owner;

import java.util.ArrayList;
import com.management.model.employees.ManagementEmployee;

/*
 * listFacilityProblems()
 * calcMaintenanceCostForFacility()
 * calcProblemRateForFacility()
 * listFacilityFloorsUsed()
 */
public class OwnerEmployee extends ManagementEmployee {
	
	private ArrayList<String> problems = new ArrayList<String>();
	private final int price = 100;
	private ArrayList<String> floors = new ArrayList<String>();
	
public void addProblem(String p) {
	problems.add(p);
}

public void removeProblem(String p) {
	problems.remove(p);
}
public ArrayList<String> getProblems() {
	return problems;
}
public ArrayList<String> listFacilityProblems(){
	return problems;
}

public double calcMaintenanceCostForFacility() {
	double cost = 0;
	for (int i = 0; i <= problems.size(); i++) {
		cost = cost + 100;
	}
	return cost;
}
public double calcProblemRateForFacility() {
	double problemRate;
	problemRate = problems.size() / 100;
	problemRate = problemRate * 100;
	
	return problemRate;
}

public void addFloorUsed(String p) {
	floors.add(p);
}

public void removeFloorUsed(String p) {
	floors.remove(p);
}
public ArrayList<String> listFacilityFloorsUsed(){
	return floors;
}
}
