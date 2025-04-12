package com.emp;

public class Employee {

	public static void main(String[] args) {
		Empdetails emp = new Empdetails();
		
		emp.setEmpId(1);
		emp.setEmpName("Tejas Aher");
		emp.setSalary(100000);
		
		System.out.println("Employee Id: " + emp.getEmpId());
		System.out.println("Employee name: " + emp.getEmpName());
		
		
	}

}
