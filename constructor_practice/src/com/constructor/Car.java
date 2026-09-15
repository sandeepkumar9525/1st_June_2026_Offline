package com.constructor;

public class Car {
	// instance variables
	String brand;
	String model;
	double price;

	//parameterized constructor
	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// method display
	public void display() {
		System.out.println("Car Brand : " + brand);
		System.out.println("car Model : " + model);
		System.out.println("Car Price : " + price);
	}

	public static void main(String[] args) {
		Car car = new Car("BMW", "X5", 9600000);
		car.display();
		
		System.out.println();
		
		Car car2 = new Car("Lend Rover", "Defender", 1070000);
		car2.display();
	}

}
