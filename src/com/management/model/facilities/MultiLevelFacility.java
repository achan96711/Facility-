package com.management.model.facilities;

import java.util.List;

public class MultiLevelFacility implements ConcreteFacilityI {
	List<Floor> floors;
	String facilityInformation;
	int capacity;
	Warehouse warehouse;

	@Override
	public String getFacilityInformation() {
		return facilityInformation;
		
	}

	@Override
	public int requestAvailableCapacity() {
		 return capacity;
	 }

	@Override
	public void addFacilityDetail(String f) {
		 warehouse.facilityInfo.add(f);
	 }
}
