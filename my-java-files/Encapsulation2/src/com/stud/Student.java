package com.stud;

public class Student {

	public static void main(String[] args) {
		Studdetails stud=new Studdetails();
		
		stud.setId(5);
		stud.setMarks(56);
		stud.setName("Tejas Aher");
		
		System.out.println("Your id: " + stud.getId());
		System.out.println("Your marks: " + stud.getMarks());
		System.out.println("Your name: " + stud.getName());
		
		
	}

}
