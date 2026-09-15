package com.kodewal1;

// parent class
class Animal {
	public void eat() {
		System.out.println("Animal.eat()");
	}
}

interface Pet {
	void play();
}

interface Trainable {
	void train();

}

// Child class extending a class and implements interface
class Dog extends Animal implements Pet, Trainable {

	@Override
	public void train() {
		System.out.println("Dog is Playing()");

	}

	@Override
	public void play() {
		System.out.println("Dog is being Trained()");

	}

}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.play();
		dog.train();
	}
}
