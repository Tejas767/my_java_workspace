package com.student;

public class Marks extends Student {
	
	int subject1=70;
	int subject2=80;
	int total;
	
	

	public int total() {
		return total=subject1+subject2;
		
	}
	
	

	public static void main(String[] args) {
		 Marks marks=new Marks();
		System.out.println("Student roll: "+marks.roll_num);
		System.out.println("Student Name: "+marks.Name);
		System.out.println("Total marks: "+marks.total()); 
		 
		 
	}

}
