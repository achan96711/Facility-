package com.management.model.employees;

public abstract class Employee {
	public abstract void addNewFacility();
	public abstract void removeFacility();
	public abstract void listActualUsage();
	public abstract double calcUsageRate();
	public abstract void vacateFacility();
		public abstract int isInUseDuringInterval() /*usage tracked in days as integer */;
		public abstract void assignFacilityToUse();
		public abstract void listInspections();
		public abstract void makeFacilityMaintRequest();
		public abstract void scheduleMaintenance();
		public abstract double calcDownTimeForFacility();
		public abstract void listMaintRequest();
		public abstract void listMaintenance();
}
