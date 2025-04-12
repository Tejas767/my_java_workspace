package com.emp;

public class Empdetails {
	
	   private int empId;
	   private String empName;
	   private long salary;
	
	
	
	
   public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		
		if (salary>10000) {
			this.salary = salary;
			System.out.println("Your Salary: "+ getSalary());
		}else {
			System.out.println("---Warning Message: Salary cannot be Less than 10k---");
		}
		
	}
 
   
   
}
