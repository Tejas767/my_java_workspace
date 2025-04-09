package com.hosp;

public class Hospdetails {
	private String   location;
	private  String patientname;
    private	 int num_of_beds;
	private  int rating;
	 
	
public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getNum_of_beds() {
		return num_of_beds;
	}
	public void setNum_of_beds(int num_of_beds) {
		this.num_of_beds = num_of_beds;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
