package com.bank;

public class Bankdetails {

	private String accountNumber;
    private String accountHolderName;
    private double balance;
    double initialamount;
    
    public double  initialamount(double initialamount) {
    	balance += initialamount;
		return this.initialamount=initialamount;
    	
    }
    
    public void deposit(double deposit) {
    	
    	if (deposit>0) {
    		balance +=deposit;
    		System.out.println("Your deposited amount is: "+ balance);
    	}else {
    		System.out.println("Deposit amount cannot be negative");
    	}	 
    }
    
    
    public void withdraw(double withdraw) {
    	if (balance>withdraw) {
    		balance -= withdraw;
    	}else{
    		System.out.println("Insuffient Balance to withdraw");
    	}
    }
    
    public void bankbal() {
    	System.out.println("Your bankbalance is: " + balance);
    }
    
    
    
    
    
    
    
    
	
}
