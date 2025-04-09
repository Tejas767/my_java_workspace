package emp;

import java.util.Scanner;

public class Dispemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name");
		String name = sc.nextLine();

		System.out.println("Enter your id");
		int id = sc.nextInt();

		System.out.println("Enter your Salary");
		int basicsalary = sc.nextInt();

		Empdetails emp = new Empdetails(name, id, basicsalary);

		emp.Da();
		emp.Hra();
		emp.netsalary();
		emp.printsalaryslip();

		sc.close();
	}
}
