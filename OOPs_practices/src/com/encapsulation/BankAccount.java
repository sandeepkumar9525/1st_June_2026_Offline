package com.encapsulation;

public class BankAccount {
	// intsance variables
	private double balance;

	// parametrizeds constructor
	public BankAccount(double balance) {
		this.balance = balance;

	}
// getBalance methods getter read data
	public double getBalance() {
		return balance;

	}
// methods deposit
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Amount : " + amount);
		} else {
			System.out.println("Invaild Amount");
		}
	}
	
	// methods withdraw
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw Amount :" + amount);
		} else {
			System.out.println("invalid Amount");

		}
	}

	public static void main(String[] args) {
		BankAccount sc= new BankAccount(12000);
		
		//sc.deposit(-2); invalid amount
		
		sc.deposit(5000);// Deposit amount 
		
		//sc.withdraw(200000); invalid amount
		
		sc.withdraw(8000); // withdraw Amount
		
		System.out.println("Final Balance: " + sc.getBalance());
	}
}
