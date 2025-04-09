package com.tka;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int a=sc.nextInt();
		
		Double area=3.1416*a*a;
		System.out.println("Area of circle is" + area);
      sc.close();
	}

}
