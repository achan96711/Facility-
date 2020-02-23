package com.management.model.facilities;

public class SingleLevelFacility implements ConcreteFacilityI {
	Floor singleFloor;
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
