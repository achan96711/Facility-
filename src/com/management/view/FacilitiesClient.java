package com.management.view;

import java.util.Scanner;

import com.management.model.employees.ManagementEmployee;
import com.management.model.employees.WarehouseManager;
import com.management.model.facilities.Warehouse;

public class FacilitiesClient {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 to add a facility, Enter 0 to exit.");
		
		//call methods here
		WarehouseManager whouse = new WarehouseManager();
		
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		
		if (userInput.equals("1")) {
			Warehouse wobj = new Warehouse();
			whouse.addNewFacility(wobj);
			System.out.println("Facility added.");
		}
		else if (userInput.equals("0")) {
			System.out.println("Exiting. Thank you.");
		}
		
		System.out.println("Enter 1 to view usage rate. Enter 0 to exit");
		
		String usage = keyboard.nextLine();
		
		if (usage.equals("1")) {
		whouse.calcUsageRate(124);
		}
		else if (usage.equals("0")) {
			System.out.println("Exiting. Thank you.");
		}
		}

}
