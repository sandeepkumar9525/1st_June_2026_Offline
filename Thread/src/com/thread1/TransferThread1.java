package com.thread1;

public class TransferThread1 extends Thread {
	private BankAccount sender;
	private BankAccount receiver;
	
	public TransferThread1(BankAccount sender, BankAccount receiver) {
		
		this.sender = sender;
		this.receiver = receiver;
	}
	@Override
	public void run() {
		BankAccount.transfer(receiver, 800);
	}
	
	

}
