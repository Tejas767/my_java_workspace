package com.hosp;

public class Hospital {
	
public static void main(String[] args) {
	
	Hospdetails hp =new Hospdetails();
	hp.setLocation("Mumbai");
	hp.setNum_of_beds(10);
	hp.setPatientname("Rahul");
	hp.setRating(8);
	
	System.out.println(hp.getLocation());
	System.out.println(hp.getNum_of_beds());
	System.out.println(hp.getPatientname());
	System.out.println(hp.getRating());
	
}
 
 
 }