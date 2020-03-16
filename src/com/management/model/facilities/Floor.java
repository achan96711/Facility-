package com.management.model.facilities;

import java.util.ArrayList;

public class Floor {
	
	boolean inUse;
	ArrayList<String> floorsInUse = new ArrayList<String>();
	int floor;
	
public ArrayList<String> getFloorsInUse() {
	return floorsInUse;
}
public void setUse(int floorUsed) {
	 floor = floorUsed;
}
public void addFloor(String floorSet) {
	floorsInUse.add(floorSet);
}
}
