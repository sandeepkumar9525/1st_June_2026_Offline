package com.encapsulation;

public class BOIATM {
	private double balance;
	private String pin ="4321";
	
	public void withdraw(double amountToWithdraw, String enteredPIn) {
		if(enteredPIn.equals(pin) && amountToWithdraw <=balance) {
			balance = balance-amountToWithdraw;
			System.out.println(" Balance Post Withdraw :" + balance);
			
		}else {
			System.out.println("Error :(withdraw) Incorrect Pin pl Tryagin " );
		}
	}
	public void deposit(double amount, String enteredPin) {
		if(amount >0) {
			balance = balance + amount;
			System.out.println("Deposit new Balance : " + balance);
			
		}else {
			System.out.println("Error :(deposit) Incorrect Pin pl Tryagin ");
		}
	}
	
	public static void main(String[] args) {
		BOIATM at = new BOIATM();
		at.balance = 10000;
		at.deposit(2000, "4321");
		at.withdraw(7000, "4321");
	}
}
