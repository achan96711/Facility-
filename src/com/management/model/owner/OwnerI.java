package com.management.model.owner;

import java.util.ArrayList;

public interface OwnerI {
ArrayList<String> listFacilityProblems();
double calcMaintenanceCostForFacility();
double calcProblemRateForFacility();
int listFacilities();
}
