package com.tka;

public class Employee {

	public Employee(int id,String name,String salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
	
	public static void main(String[] args) {
		
         Employee emp=new Employee(101, "tejas", "5 LPA");
	}

}
