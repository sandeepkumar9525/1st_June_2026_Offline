package com.thread5;

class BankAccount {
	private double balance;

	public synchronized void withdraw(int amount) {
		System.out.println("[" + Thread.currentThread().getName() + "] is typing to withdraw: " + amount);

		try {
			System.out.println(" Insufficient balance " + this.balance + "[" + Thread.currentThread().getName()
					+ " ] is going to wait");
			wait();

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		this.balance -= amount;
		System.out.println("Withdraw is successfull : " + Thread.currentThread().getName() + " withdraw " + amount
				+ "Remaining balance" + this.balance);

	}

	public synchronized void deposit(int amount) {

		System.out.println(" [" + Thread.currentThread().getName() + "] is typing to deposit: " + amount);
		this.balance += amount;
		System.out.println(" new balance after disposit : " + this.balance);
		System.out.println(" Notifying all waiting thread ");
		notifyAll();

	}

}

public class Main {

	public static void main(String[] args) {
		BankAccount at = new BankAccount();

		Thread rohitThread = new Thread(() -> at.withdraw(10000), "Rahul");
		Thread fatherThread = new Thread(() -> {
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			at.deposit(6000);
		}, "Father");

		rohitThread.start();
		fatherThread.start();

	}

}
