package com.tka;

public class Circle {
	
	public Circle(int radius) {
		
		Double area=3.1416*radius*radius;
		System.out.println(area);
		
	}

	public static void main(String[] args) {
		
     Circle c= new Circle(10);
	}

}
