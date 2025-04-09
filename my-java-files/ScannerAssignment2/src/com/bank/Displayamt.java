package com.bank;

import java.util.Scanner;

public class Displayamt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();

		System.out.println("Enter money you want to deposit");
		int dpamount = sc.nextInt();

		System.out.println("Enter amt you want to withdraw");
		int withdraw = sc.nextInt();

		Bankacc account = new Bankacc(name);
		account.deposit(dpamount);
		account.withdraw(withdraw);
		System.out.println(account.Displabalance());

		sc.close();

	}

}
