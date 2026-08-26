package com.inheritance;

public class BankSystem {
	// instance variables
	private long accountNumber;
	private double balance;
	
	// Parameterized constructor
	public BankSystem(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	// methods showBalance
	public void showBalance() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
// child class inheriting BankSystem using extends
class ShavingAccountInfo extends BankSystem{
	// instance variables
	private String name;
	
	//parameterized constructor
	public ShavingAccountInfo(long accountNumber, double balance,String name) {
		super(accountNumber, balance);		
		this.name = name;
		
	}
	
	// methods showBalance
	@Override
	public void showBalance() {
		super.showBalance();
		System.out.println("Account Holder Name : " + name);
		
	}
	
}

//child class inheriting BankSystem using extends
class CurrentAccount extends BankSystem{
	private String name;
	public CurrentAccount(long accountNumber, double balance ,String name) {
		super(accountNumber, balance);
		
		this.name = name;
		
	}
	@Override
	public void showBalance() {
		super.showBalance();
		System.out.println("Account Holder Name : " + name);
	}
	public static void main(String[] args) {
		
		BankSystem st = new BankSystem(123458654578829L, 1000.890);
		st.showBalance();
		
		System.out.println();
		
		BankSystem st2 = new ShavingAccountInfo(1234567654L, 100000.345, "Sandeep Kumar");
		st2.showBalance();
		
		System.out.println();
		
		BankSystem st3 = new CurrentAccount(98765432123L, 6000.000, "Sarika Kumari");
		st3.showBalance();
	}
	
}
