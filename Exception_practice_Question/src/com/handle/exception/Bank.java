package com.handle.exception;

public class Bank {
	static void checkBanalce(double amount, double balance) throws Exception {
		if(amount <balance) {
			throw new Exception("Insufficient balance");
		}
		System.out.println("Writhdraw is successful ");
	}

	public static void main(String[] args) {
		try {
			checkBanalce(9000, 2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
