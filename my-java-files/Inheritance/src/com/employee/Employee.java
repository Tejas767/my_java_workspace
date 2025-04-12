package com.employee;

public class Employee {
    
    int empId;
    String empname;
    
    public void empname(String name) {
        empname = name;
        System.out.println("Employee name: " + empname);
    }
    
    public void empid(int empid) {
        empId = empid;
        System.out.println("Employee id: " + empId);
    }
}
