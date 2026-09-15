package com.kodewal2;

public class SavingsAccount implements BankAccount {
	private double balance;

	public SavingsAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposti : " + amount);
		System.out.println("SavingsAccount new Balance : " + balance);

	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance = balance - amount;
			System.out.println("Withdraw : " + amount);
			System.out.println("Saving Account New Balance : " + balance);
		} else {
			System.out.println("Invalid Balance");
		}

	}

	@Override
	public double checkBalance() {
		return balance;

	}

}
