package com.abstractt;

public abstract class Vehicle {
	abstract void start();
	void stop() {
		System.out.println("Vehicle.stop()");
	}

}
class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("Car.start()");
		
	}
	public static void main(String[] args) {
		//Vehicle st = new Vehicle(); {Cannot instantiate the type Vehicle, compile-time ERROR }
		
		
		Vehicle cd = new Car();
		cd.start();
		cd.stop();
	}
	
}