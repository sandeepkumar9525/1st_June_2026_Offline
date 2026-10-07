package com.thread2;

public class UPISyatem {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		UPIThread t1= new UPIThread(account, 2000);
		
		UPIThread t2= new UPIThread(account, 3000);
		
		UPIThread t3= new UPIThread(account, 2000);
		
		t1.setName("Sandeep");
		t2.setName("Rahul");
		t3.setName("Rohit");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
