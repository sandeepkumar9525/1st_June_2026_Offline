package com.thread1;

public class BankAccount {

	private static int balance = 1000;

	public  static void transfer(BankAccount receiver, int amount) {
		System.out.println("[" + Thread.currentThread().getName()
				+ "] 20 line code -- sending email notification.. requested the found transfer");

		
		synchronized (BankAccount.class) {
			
			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + "]  Cheaked balance: " + balance);
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance = balance - amount;
				receiver.balance = receiver.balance + amount;
				System.out.println("[" + Thread.currentThread().getName() + "] transferred " + amount);
			} else {
				System.out.println("[" + Thread.currentThread().getName() + "] Insufficient Balance");
			}
		}
		
		System.out.println("[" + Thread.currentThread().getName()
				+ "] 20 line code -- sending email notification.. requested the found transfer");

	}

	public int getBalance() {
		return balance;

	}

}
