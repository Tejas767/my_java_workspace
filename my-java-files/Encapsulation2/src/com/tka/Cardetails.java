package com.tka;

public class Cardetails {

	private int model;
	private int year;
	private int price;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
       if (price<= 0) {
    	   System.out.println("Car price cannot be 0 or less than 0");
       }else {
    	   this.price = price;
    	   System.out.println("Car Price: "+ getPrice());
    	  
       }
		

	}

}
