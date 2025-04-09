package com.tka;

import java.util.Scanner;

public class Studgradedisp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter your roll no.");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your course");
		String course=sc.nextLine();
		
		System.out.println("Enter your percentage.");
		double percentage=sc.nextDouble();
		
		
		StudGrade std=new StudGrade(id, name, course, percentage);
		
			
	}

}
