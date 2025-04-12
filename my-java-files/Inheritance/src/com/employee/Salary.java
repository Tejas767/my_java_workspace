package com.employee;

public class Salary extends Employee {
    
    int HRA;
    int DA;
    int basicpay;
    int totalsalary;

    public int basicpay(int basicpay) {
        return this.basicpay = basicpay; 
    }
    
    public int Hra() {
        return HRA = basicpay * 50 / 100;
    }

    public int Da() {
        return DA = basicpay * 10 / 100;
    }

    public int totalsalary() {
        return totalsalary = basicpay + HRA + DA;
    }

    public void salarydetails() {
        System.out.println("------------------------------------------------------------");
        System.out.println("                         SALARY SLIP                        ");
        System.out.println("------------------------------------------------------------");
        System.out.println("EARNINGS");
        System.out.println("------------------------------------------------------------");
        System.out.println("Basic Salary                : ₹" + basicpay);
        System.out.println("House Rent Allowance (HRA)  : ₹" + HRA);
        System.out.println("Dearness Allowance (DA)     : ₹" + DA);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Salary                : ₹" + totalsalary);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Salary emp = new Salary();

        emp.empname("Tejas Aher");
        emp.empid(1);
        emp.basicpay(10000);
        emp.Hra();
        emp.Da();
        emp.totalsalary();
        emp.salarydetails();
    }
}
