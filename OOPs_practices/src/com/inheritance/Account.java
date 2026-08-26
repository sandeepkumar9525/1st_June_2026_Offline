package com.inheritance;

public class Account {
	// instance variables
	double balance;

	// constructor
	public Account(double balance) {
		this.balance = balance;

	}
	
// methods show the balance
	public void showBalance() {
		System.out.println("Account Balance : " + balance);
	}
}

// child class inheriting Account using 'extends'
class ShavingAccount extends Account {
	double interestRate;

	// constructor
	public ShavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;

	}
//  methods to CalculateInterest interest
	public void CalculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("Interest Earned : " + interest);

	}

	public static void main(String[] args) {
		// Create shavingAccount object
		ShavingAccount ac = new ShavingAccount(10000, 5);
		
		ac.showBalance();// inherited methods from Account class
		
		ac.CalculateInterest();// methods from shavingAccount class
	}
}
