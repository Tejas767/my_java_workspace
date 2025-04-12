package com.vehicle;

public class Car extends Vehicle {
	
	public void drive() {
		System.out.println("A person is driving a car");
	}

	public static void main(String[] args) {
		
		Car car= new Car();
		car.start();
		car.drive();
	}

}
