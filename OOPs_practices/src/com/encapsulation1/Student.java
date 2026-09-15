package com.encapsulation1;

public class Student {
	private double balance;
	
	public double amount;
	
	public Student(double balance , double amount) {
		this.amount = amount;
		this.setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}