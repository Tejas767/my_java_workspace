package com.tka;

public class Car {

	public static void main(String[] args) {
		Cardetails car = new Cardetails();
		
		car.setPrice(100);
		car.setModel(101);
		car.setYear(2021);

		System.out.println("Car model: " + car.getModel());
		System.out.println("Car Year: " + car.getYear());
        
	}

}
