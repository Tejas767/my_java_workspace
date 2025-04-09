package emp;

public class Empdetails {

	int basicsalary;
	int netsalary;
	int HRA;
	int DA;
	int id;
	String name;

	public Empdetails(String name, int id, int basicsalary) {
		this.name = name;
		this.id = id;
		this.basicsalary = basicsalary;

	}

	public int Hra() {
		return HRA = basicsalary * 50 / 100;
	}

	public int Da() {
		return DA = basicsalary * 10 / 100;
	}

	public int netsalary() {
		return netsalary = basicsalary + HRA + DA;
	}

	public void printsalaryslip() {
		System.out.println("------------------------------------------------------------");
		System.out.println("                         SALARY SLIP                        ");
		System.out.println("------------------------------------------------------------");
		System.out.println("Employee Name   : " + name);
		System.out.println("Employee ID     : " + id);
		System.out.println("------------------------------------------------------------");
		System.out.println("EARNINGS");
		System.out.println("------------------------------------------------------------");
		System.out.println("Basic Salary                : ₹" + basicsalary);
		System.out.println("House Rent Allowance (HRA)  : ₹" + HRA);
		System.out.println("Dearness Allowance (DA)     : ₹" + DA);
		System.out.println("------------------------------------------------------------");
		System.out.println("Net Salary                  : ₹" + netsalary);
		System.out.println("------------------------------------------------------------");
	}
}
