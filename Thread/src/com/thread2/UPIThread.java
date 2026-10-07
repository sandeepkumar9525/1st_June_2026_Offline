package com.thread2;

public class UPIThread extends Thread {
	private BankAccount account;
	private int amount;

	public UPIThread(BankAccount account, int amount) {
		super();
		this.account = account;
		this.amount = amount;
	}
	@Override
	public void run() {
		account.transfer(Thread.currentThread().getName(),amount);
	}

}
