package com.tka;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int count=0;
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		
	
		
		for (int i=1;i<=n;i++) {
			if(n%i==0) 
				count++;
		}
		
		if (count==2)
			   System.out.println("it is a prime number");
		else
			System.out.println("not a prime number");
		
		sc.close();

	}

}
