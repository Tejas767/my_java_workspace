package com.car;

import java.util.Scanner;

public class Car {
  public static void main(String[] args) {
	  	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter car name");
	   String carname=sc.nextLine();
	   
	   System.out.println("Enter the car color");
	   String color=sc.nextLine();
	   
	   
	   System.out.println("Enter the price of the car");
	   String price=sc.nextLine();
	   
	   
	   System.out.println("Enter Fuelcapcity of the car");
	   int capacity=sc.nextInt();
	   
	   
	   
	   Cardetails car= new Cardetails();

	   
	   car.setCarname(carname);
	   car.setColor(color);
	   car.setPrice(price);
	   car.setFuelcap(capacity);
	   
	  System.out.println("Carname: "+car.getCarname());
	  System.out.println("Color of car: "+car.getColor());
	  System.out.println("Car Price: "+car.getPrice());
	  System.out.println("FuelCapacity of the car: "+car.getFuelcap());
	   
	   
	  
	   
	  
  }
}
