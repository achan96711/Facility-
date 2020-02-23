package com.management.model.employees;

import java.util.ArrayList;
import java.util.List;

import com.management.model.customer.Customer;
import com.management.model.facilities.Warehouse;


public class FacilitySecretary extends ManagementEmployee {

	private WarehouseManager warehouseManager;
	
	public void addNewfacility(Warehouse w) {
		warehouseManager.addNewFacility(w);
	}
	public void removeFacility(String r) {
		warehouseManager.removeFacility(r);
	}
	
	public void assignFloor(List<String> floors) {
		Customer customer = new Customer();
		customer.setFloorsAssignments(floors);
	}
}
