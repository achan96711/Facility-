package com.management.model.customer;

import java.util.List;

public interface CustomerI {
String getFirstName(); 
String getLastName();
void setFirstName(String s); 
void setLastName(String s);
List<String> getFloorsAssignments();
void setFloorsAssignments(List<String> s);

}
