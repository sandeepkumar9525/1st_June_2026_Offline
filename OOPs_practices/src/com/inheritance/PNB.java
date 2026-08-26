package com.inheritance;

public class PNB {
	// instances variables
	double amount;

	// constructor
	public PNB(double amount) {
		this.amount = amount;

	}
//methods show the amount
	public void show() {
		System.out.println("PNB Amount : " + amount);
	}

}
//child class inheriting PNB using 'extends'
class ShavingPNB extends PNB {
	// instance variable
	double interestRate;
	// constructor
	public ShavingPNB(double amount, double interestRate) {
		super(amount);
		this.interestRate = interestRate;
	}
	// methods calculateInreset the interest
	public void calculateInterest() {
		double interest = amount * interestRate / 100;
		System.out.println("interest Earn : " + interest);
	}

	public static void main(String[] args) {
		// ShavingPNB create the Object
		ShavingPNB sc = new ShavingPNB(2000, 10);
		
		sc.show(); //  inherited methods from PNB class
		
		sc.calculateInterest();// methods from shavingPNB class
	}
}