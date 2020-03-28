package com.management.view;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.management.model.customer.Address;
import com.management.model.customer.AddressI;
import com.management.model.customer.CustomerI;
import com.management.model.customer.Payment;
import com.management.model.employees.ManagementEmployee;
import com.management.model.employees.WarehouseManager;
import com.management.model.facilities.Floor;
import com.management.model.facilities.Warehouse;
import com.management.model.service.CustomerService;

public class FacilitiesClient {

	public static void main(String args[]) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF2/app-context2.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
        //Also, bootstrapping the CustomerService instantiation using factory
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        
        CustomerI customer = customerService.getCustomer();
		customer.setFirstName("Zoom");
        customer.setLastName("Video Communications");
        customer.setCustomerId("PDW425");
        
        //Spring to inject the right object implementation in CustomerI object for FacilityAddress using Setter Injection
        AddressI FacilityAddress = customer.getFacilityAddress();
        
        FacilityAddress.setStreet("3535 Wacker Dr.");
        FacilityAddress.setUnit("Floor 4");
        FacilityAddress.setCity("Chicago");
        FacilityAddress.setState("IL");
        FacilityAddress.setZip("66610");
        
        //Spring to inject the right object implementation in Payment using setter injection
        Payment payment = new Payment();
        payment.setCardNumber(591962541);
        payment.setPaymentType("Visa");
        payment.setPrice(2850);
        
        //Print lease summary
        System.out.println("\tLessee of Facility: \t" + customer.getFirstName() + " " + customer.getLastName() + "\n");
        System.out.println("\tFacility Address:\t" + customer.getFacilityAddress().getStreet() + 
        		"\n\t\t\t\t" + customer.getFacilityAddress().getUnit() + 
        		"\n\t\t\t\t" + customer.getFacilityAddress().getCity() + ", " + 
        		customer.getFacilityAddress().getState() + " " + customer.getFacilityAddress().getZip() +
        		"\n");
        
        String paymentType = payment.getPaymentType();
    	int cardNumber = payment.getCardNumber();
    	int price = payment.getPrice();
    	
        System.out.println("\n\tRent Expected:\t\t" + "$" + price);
        System.out.println("\n\tCard Number:\t\t" + cardNumber);
        System.out.println("\n\tPayment Type:\t\t" + paymentType + "\n");
        
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
		keyboard.close();
		}

}
