package com.polymorphism;

public class Payment {
	void play() {
		System.out.println("Payment.play()");
	}

}

class UPI extends Payment{
	
	@Override
	void play() {
		System.out.println("Payment through UPI..");
	}
}

class Card extends Payment{
	@Override
	void play() {
		System.out.println("payment Through Card");
	}
	public static void main(String[] args) {
		Payment payment = new UPI();
		payment.play();
		
		payment = new Card();
		payment.play();
	}
}