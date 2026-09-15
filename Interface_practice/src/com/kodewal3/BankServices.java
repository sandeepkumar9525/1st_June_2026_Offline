package com.kodewal3;

public interface BankServices {

	void deposit(double amount);

}

interface LonServices{
	void applyLon(double amount);
}

class Customer implements BankServices, LonServices{

	@Override
	public void applyLon(double amount) {
		System.out.println("Deposit : " + amount);
		
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Lon Applyed for : " + amount);
		
	}
	public static void main(String[] args) {
		Customer st = new Customer();
		st.applyLon(10000);
		st.deposit(50000);
	}
	
}