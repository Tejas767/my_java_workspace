package com.tka;

import java.util.Scanner;

public class Evenodd {

	public void display() {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter your number");
		int n=sc.nextInt();
		
		if (n%2==0) {
			System.out.println("this number is even ");
		}
		else 
			System.out.println("this number is odd");
		sc.close();
	}


}
