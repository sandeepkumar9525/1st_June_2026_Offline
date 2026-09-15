package com.encapsulation1;

public class SIBATM {

	private double balance;

	public SIBATM(double balance) {
		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;
		System.out.println("Deposit is Successful");
	}

	public void writhdraw(double amount) {

		if (balance > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Writhdraw Is successful");
		} else {
			System.out.println("Invalid Amount");
		}
	}

	public static void main(String[] args) {
		SIBATM st = new SIBATM(3000);

		st.deposit(1000);
		System.out.println(st.getBalance());

		st.writhdraw(500);
		System.out.println(st.getBalance());
	}

}
