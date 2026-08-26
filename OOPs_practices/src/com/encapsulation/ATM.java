package com.encapsulation;

public class ATM {
	private double balance = 1000.00;
	private String pin = "1234";
	
	
	// public methods to withdraw money
	public void withdraw(double amountToWithdraw, String enteredPin) {
		System.out.println("Current Balance : " + balance);
		
		if(enteredPin .equals(pin) && amountToWithdraw <=balance) {
			balance = balance-amountToWithdraw;
			System.out.println("Balance post Withdraw : " + balance);
		}else {
			System.out.println("Error : Incorrect PIN  pl Tryagin");
		}
	}
	
	// public methods to deposit money
	public void deposit(double amount, String enteredPin) {
		if(enteredPin .equals(pin))
		{
			balance = balance+ amount;
			System.out.println("Amount : " + amount);
			System.out.println("deposit new Balance : "+ balance);
			
		}else {
			System.out.println("Error : Incorrect PIN  pl Tryagin");
		}
	}
	public static void main(String[] args) {
		// create object
		ATM at = new ATM();
		
		at.balance=12000;// not allowed to access balance directly. this is encapsulated
		
		at.deposit(3000, "1234");// correct PIN , valid deposit
		
		//at.deposit(3000, "1236");// Incorrect PIN , valid deposit
		
		at.withdraw(5000, "1234");//correct PIN , valid withdraw
		
	//	at.withdraw(5000, "1234");//Incorrect PIN , valid withdraw
		
		
	}
}
