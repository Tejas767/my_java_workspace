package com.bank;

public class BankAccount {

	public static void main(String[] args) {
		Bankdetails bank= new Bankdetails();
		bank.initialamount(2);
		bank.deposit(1000);
		bank.withdraw(0);
		bank.bankbal();

	}

}
