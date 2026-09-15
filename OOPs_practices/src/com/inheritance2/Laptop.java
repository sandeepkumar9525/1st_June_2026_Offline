package com.inheritance2;

public class Laptop {

	void start() {
		System.out.println("Laptop.start()");
	}

}

class HP extends Laptop {
	void stop() {
		System.out.println("HP.stop()");
	}

	public static void main(String[] args) {
		 Laptop lp = new HP(); //upcasting
		 lp.start();
		 
		 // lp.stop(); compile-time error
		 
		 HP ad = (HP) lp; // downCasting 
		 ad.stop();
		 
		 
//		 Laptop dc = new Laptop();
//		 HP df= (HP) dc;  runtime ClassCastException: aayega
	}

}
 