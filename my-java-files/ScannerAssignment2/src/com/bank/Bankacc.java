package com.bank;

public class Bankacc {

	String accountholdername;
	int balance;
	int depositamt;
	int initialamt = 500;

	public Bankacc(String accountholdername) {
		this.accountholdername = accountholdername;
		this.balance = initialamt;

	}

	public void deposit(int depositamt) {
		if (depositamt > 0) {
			balance += depositamt;
			System.out.println("Deposited: " + depositamt);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(int withdrawamt) {

		if (withdrawamt <= 0) {
			System.out.println("Withdraw amount must be greater than 0.");
		} else if (balance >= withdrawamt) {
			balance -= withdrawamt;
			System.out.println("Withdrawn: " + withdrawamt);
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public String Displabalance() {
		return "Bankacc [accountholdername=" + accountholdername + ", balance=" + balance + ", depositamt=" + depositamt
				+ ", initialamt=" + initialamt + "]";
	}

}
