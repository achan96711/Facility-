package com.management.model.facilities;

import java.util.*;

public class Warehouse implements ConcreteFacilityI {
 private ArrayList<String> facilityInfo = new ArrayList<String>();
 private int capacity;
 private String facilityDetail;
 
 public String getFacilityDetail() {
	 return facilityDetail;
 }
 
 public void setFacilityDetail(String facilityDetail) {
	 this.facilityDetail = facilityDetail;
 }
 
 public int requestAvailableCapacity() {
	 return capacity;
 }
 
 public void setCapacity(int capacity) {
	 this.capacity = capacity;
 }
 
 public void addFacilityDetail(String f) {
	 facilityInfo.add(f);
 }
 
 public void removeFacilityDetail(String f) {
	 facilityInfo.remove(f);
 }
 
 public void getFacilityInformation() {
	 for(int i = 0; i < facilityInfo.size(); i++) {
		 System.out.println(facilityInfo.get(i));
	 }
 }
 
}
