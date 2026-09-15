package com.kodewal2;

public class Main {

	public static void main(String[] args) {
	BankAccount st = new SavingsAccount(10000);
	st.deposit(500);
	st.withdraw(200);
	st.checkBalance();
	System.out.println();
	
	BankAccount st2 = new CurrentAccount(5000);
	st2.checkBalance();
	st2.deposit(600);
	st2.withdraw(900);

	}

}
