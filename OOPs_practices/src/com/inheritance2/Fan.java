package com.inheritance2;

public class Fan {
	void start() {
		System.out.println("Fan.start()");
	}

}

class Crompton extends Fan {
	@Override
	void start() {
		System.out.println("Crompton.start()");
	}

	void stop() {
		System.out.println("Crompton.stop()");
	}

	public static void main(String[] args) {

		Fan sd = new Crompton(); // upcasting

		sd.start(); // Crompton's overridden

		// sd.stop // compile-time error

		Crompton ad = (Crompton) sd; // downcasting

		ad.stop(); // Crompton-specific
	}
}
