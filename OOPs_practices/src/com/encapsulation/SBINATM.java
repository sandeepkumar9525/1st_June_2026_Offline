package com.encapsulation;

public class SBINATM {
	private double balance;
	private String pin;

	// // Setter for balance with validation
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;

		} else {
			System.out.println("Invalid balance");
		}
	}
// Setter for PIN with validation
	public void setPin(String pin) {
		if (pin.length() == 4) {
			this.pin = pin;

		} else {
			System.out.println("Invalid PIN");
		}

	}

	public double getBalance() {
		return balance;
	}

	public String getPin() {
		return pin;
	}

	public static void main(String[] args) {
		SBINATM sc = new SBINATM();
		sc.setBalance(5000);
		sc.setPin("1236");

		System.out.println("Balance : " + sc.getBalance());
		System.out.println("PIN Number : " + sc.getPin());
	}
}
