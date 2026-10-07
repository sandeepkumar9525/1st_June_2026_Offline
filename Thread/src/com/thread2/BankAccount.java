package com.thread2;

public class BankAccount {

	private int balance = 5000;

	public  void transfer(String user, int amount) {
		System.out.println(user + " is trying to pay " + amount);

		if (balance >= amount) {
			balance = balance - amount;
			
			System.out.println(user + " payment successful : " + amount);

			System.out.println("Remaining balance : " + balance);

		} else {
			System.err.println(user + " payment faild : Insufficient balance");
		}
	}

}
