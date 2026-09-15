package com.inheritance2;

class Vehicle {
	void start() {
		System.out.println("Vehicle.start()");
	}
}

class Car extends Vehicle {
	@Override
	void start() { // methods Overriding
		System.out.println("Car.start()");
	}

	void openSunroof() {
		System.out.println("sunroof is opning()..");
	}
}

public class Main {

	public static void main(String[] args) {

		Vehicle st = new Car(); // Upcasting

		st.start();
		// st.openSunroof(); The method openSunroof() is undefined for the type Vehicle

		if (st instanceof Car) {
			Car mycar = (Car) st; // Explicit Downcasting

			mycar.openSunroof();
		}

	}

}
