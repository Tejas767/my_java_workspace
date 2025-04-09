package jbk;

public class Employee {
	int empid;
	String name;
	int age;
	String address;
	String email;
	int mob_no;
	String gender;
	String department;
	String salary;
	


	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		
		
		System.out.println(emp1.empid=101);
		System.out.println(emp1.name="tejas");
		System.out.println(emp1.age=22);
		System.out.println(emp1.address="bhosari");
		System.out.println(emp1.email="tejasaher@gmail.com");
		System.out.println(emp1.mob_no=1234456);
		System.out.println(emp1.gender="male");
		System.out.println(emp1.department="CSE");
		System.out.println(emp1.salary="5LPA");
		
		System.out.println("-------------------------------------------");
		
		Employee emp2 = new Employee();

		System.out.println(emp2.empid = 103);
		System.out.println(emp2.name = "Rahul");
		System.out.println(emp2.age = 23);
		System.out.println(emp2.address = "Mumbai");
		System.out.println(emp2.email = "rahul@gmail.com");
		System.out.println(emp2.mob_no = 987654);
		System.out.println(emp2.gender = "male");
		System.out.println(emp2.department = "Mechanical");
		System.out.println(emp2.salary = "5.5LPA");	

	}

}
