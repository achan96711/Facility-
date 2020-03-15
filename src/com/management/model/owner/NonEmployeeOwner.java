package com.management.model.owner;

import java.util.ArrayList;

import com.management.model.employees.WarehouseManager;

public class NonEmployeeOwner implements OwnerI {

	int cost = 100;
	@Override
	public ArrayList<String> listFacilityProblems() {
		OwnerEmployee ownEmp = new OwnerEmployee();
		return ownEmp.getProblems();
		}

	@Override
	public double calcMaintenanceCostForFacility() {
		return cost;
	}

	@Override
	public double calcProblemRateForFacility() {
		OwnerEmployee ownEmp = new OwnerEmployee();
		double rate = ownEmp.getProblems().size()/100;
		return rate;
	}

	@Override
	public int listFacilities() {
		WarehouseManager whouse = new WarehouseManager();
		return whouse.getFacilitiesSize();
		
	}

}
