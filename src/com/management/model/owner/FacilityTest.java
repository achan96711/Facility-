package com.management.model.owner;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.management.model.employees.WarehouseManager;
import com.management.model.facilities.Floor;
import com.management.model.facilities.Warehouse;

public class FacilityTest {

	//Test that addNewFacility works
	@Test
	public void testAddNewFacility() {
		WarehouseManager whouse = new WarehouseManager();
		
		//Check current number of facilities
		int value = whouse.getFacilitiesSize();
		//Add a new facility
		whouse.addNewFacility(new Warehouse());
		//Test that number of facilities increased by 1
		assertEquals(value + 1, whouse.getFacilitiesSize());
	}
	//Test that removeFacility works
	@Test
	public void testRemoveFacility(){
		WarehouseManager whouse = new WarehouseManager();
		
		//Add a new Facility to remove
		Warehouse wobj = new Warehouse();
		whouse.addNewFacility(wobj);
		//Remove Facility
		int value = whouse.getFacilitiesSize();
		whouse.removeFacility(wobj);
		//Test that number of facilities decreased by 1
		assertEquals(value - 1, whouse.getFacilitiesSize());
		}
	//Test that calcUsageRate works
	@Test
	public void testCalcUsageRate() {
		WarehouseManager whouse = new WarehouseManager();
		//Test that usage rate is 33.97% as it should
		assertEquals(33.97, whouse.calcUsageRate(124), 0);
		
	}
	//Test that addFloor works with getFloorsInUse
	@Test
	public void testAddFloor() {
		Floor floors = new Floor();
		
		//Add a floor using addFloor()
		floors.addFloor("1");
		//Set variable for floorsInUse
		ArrayList<String> inUse = floors.getFloorsInUse();
		//Convert ArrayList values to String values
		StringBuilder sb = new StringBuilder();
		for (String s : inUse) {
			sb.append(s);
		}
		//Test that getFloorsInUse has floor added from addFloor method
		assertEquals("1", sb.toString() );
}
}
