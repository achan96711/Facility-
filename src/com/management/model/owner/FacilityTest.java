package com.management.model.owner;

import static org.junit.Assert.*;

import org.junit.Test;

import com.management.model.employees.WarehouseManager;
import com.management.model.facilities.Warehouse;

public class FacilityTest {

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
	@Test
	public void testCalcUsageRate() {
		WarehouseManager whouse = new WarehouseManager();
		//Test that usage rate is 33.97% as it should
		assertEquals(33.97, whouse.calcUsageRate(124), 0);
		
	}
	

}
