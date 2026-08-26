package com.handle1;

public class Bank {

	public static void withdraw(double balance, double amount) {
		if (amount < 0)
			throw new IllegalArgumentException("Invalid amount");

		if (amount > balance)
			throw new IllegalArgumentException("insufficient balance");
		System.out.println("Successfull withdraw");
	}
	public static void main(String[] args) {
		try {
			withdraw(6000,4000);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Tranaction Finished");
		}
	}

}
