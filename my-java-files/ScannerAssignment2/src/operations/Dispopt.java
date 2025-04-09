package operations;

import java.util.Scanner;

public class Dispopt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inputoperations inopt = new Inputoperations();

		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Divide");
		System.out.println("4. Multiply");
		System.out.print("Enter your choice (1-4): ");
		int opt = sc.nextInt();

		if (opt < 1 || opt > 4) {
			System.out.println("Enter the correct value");
		} else {
			System.out.println("Enter 1st value");
			int val1 = sc.nextInt();

			System.out.println("Enter 2nd value");
			int val2 = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Addition of two numbers: " + inopt.add(val1, val2));
				break;

			case 2:
				System.out.println("Subtraction of two numbers: " + inopt.subtract(val1, val2));
				break;

			case 3:
				System.out.println("Division of two numbers: " + inopt.div(val1, val2));
				break;

			case 4:
				System.out.println("Multiplication of two numbers: " + inopt.multiply(val1, val2));
				break;

			default:
				System.out.println("plsss enter correct value ");

			}

		}
		sc.close();

	}

}
