package com.tka;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your subject 1 marks: ");
		int sub1=sc.nextInt();	
		
		System.out.println("Enter your subject 2 marks: ");
		int sub2=sc.nextInt();	
		
		System.out.println("Enter your subject 3 marks: ");
		int sub3=sc.nextInt();	
		
		System.out.println("Enter your subject 4 marks: ");
		int sub4=sc.nextInt();	
		
		System.out.println("Enter your subject 5 marks: ");
		int sub5=sc.nextInt();	
			
		
		int total = sub1+sub2+sub3+sub4+ sub5;
		double percentage=((double)total/500)*100;
		
		System.out.println("Your percentage is: " + percentage + "%");
		
		sc.close();
		
	}

}
