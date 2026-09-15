package com.kodewal2;

public class CurrentAccount  implements BankAccount{
	 private double balance;
	 public CurrentAccount(double balance) {
		 this.balance= balance;
	 }
	@Override
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposit : " + amount);
		System.out.println("Corrent Account : " + balance);
		
	}

	@Override
	public void withdraw(double amount) {
		 balance = balance-amount;
		 System.out.println("Withdraw : " + amount);
		 System.out.println("Current Balance : " + balance);
		
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
