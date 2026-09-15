package com.kodewal2;

public interface BankAccount {
public static final double MIN_BALANCE = 1000.00; // constant

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double checkBalance();
	
}
