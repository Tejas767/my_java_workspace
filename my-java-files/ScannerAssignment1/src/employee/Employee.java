package employee;

import java.util.Scanner;

public class Employee {
	

	int id;
	String name;
	String address;

	public void emp() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your id: ");
		this.id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your name: ");
		this.name = sc.nextLine();

		System.out.println("Enter your address: ");
		this.address = sc.nextLine();
		sc.close();

	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
