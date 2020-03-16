package com.management.view;

import java.util.Scanner;

import com.management.model.employees.ManagementEmployee;
import com.management.model.employees.WarehouseManager;
import com.management.model.facilities.Floor;
import com.management.model.facilities.Warehouse;

public class FacilitiesClient {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 to add a facility, Enter 0 to exit.");
		
		//call methods here
		WarehouseManager whouse = new WarehouseManager();
		Floor floors = new Floor();
		
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		
		//Add a facility using addNewFacility()
		if (userInput.equals("1")) {
			Warehouse wobj = new Warehouse();
			whouse.addNewFacility(wobj);
			System.out.println("Facility added.");
		}
		else if (userInput.equals("0")) {
			System.out.println("Exiting. Thank you.");
		}
		
		//Find usage rate using calcUsageRate()
		System.out.println("Enter 1 to view usage rate. Enter 0 to exit");
		
		String usage = keyboard.nextLine();
		
		if (usage.equals("1")) {
			whouse.calcUsageRate(124);
		}
		else if (usage.equals("0")) {
			System.out.println("Exiting. Thank you.");
		}
		
		//Puts floors in use using getFloorsInUse() and addFloor()
		System.out.println("Enter 1 to set a floor to be in use. Enter 0 to exit");
		String inUse = keyboard.nextLine();
		
		if (inUse.equals("1")) {
			System.out.println("Enter number of floor: ");
			String floorSet = keyboard.nextLine();
			floors.setUse(Integer.parseInt(floorSet));
			floors.addFloor(floorSet);
			System.out.println("Floor " + floorSet + " is now in use.");
			System.out.println("Floors in use are " + floors.getFloorsInUse() + ".");
		}
		else if (inUse.equals("0")) {
			System.out.println("Exiting. Thank you.");
		}
		}

}
