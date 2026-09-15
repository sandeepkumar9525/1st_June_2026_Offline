package com.kodewal;

public interface Vehicle {

	abstract void startEngine();

	void stopEngine();

}

class Car implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Car.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("Car.stopEngine()");

	}

}
// bike implements by vehicle(parent Class)  
class Bike implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Bike.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("Bike.stopEngine()");

	}

	
		public static void main(String[] args) {
			
			Vehicle st = new Car();
			Vehicle st2 = new Bike();
			
			st.startEngine();
			st2.startEngine();
			
		
	}

}