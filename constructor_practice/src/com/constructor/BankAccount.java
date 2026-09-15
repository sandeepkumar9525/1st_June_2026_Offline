package com.constructor;

public class BankAccount {
	long accountNumber;
	double balance;

	// default constructor
	public BankAccount() {
		accountNumber = 1234567865432345L;
		balance = 188.09;
	}

	public void display() {
		System.out.println("Bank Account number : " + accountNumber);
		System.out.println("Bank Balance : " + balance);
	}

	public static void main(String[] args) {
		BankAccount bk = new BankAccount();

		bk.display();
	}

}
