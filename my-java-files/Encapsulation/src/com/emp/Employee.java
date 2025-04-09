package com.emp;

public class Employee {

	public static void main(String[] args) {
		Empdetails emp=new Empdetails();
		emp.setEmpid(101);
		emp.setEmpname("Tejas Aher");
		emp.setSalary(10000);
		emp.setAddress("Pune");

		System.out.println("Your empid is: " +emp.getEmpid());
		System.out.println("Employee name: "+emp.getEmpname());
		System.out.println("Employee salary: "+emp.getSalary());
		System.out.println("EMployee address: "+emp.getAddress());

	}

}
