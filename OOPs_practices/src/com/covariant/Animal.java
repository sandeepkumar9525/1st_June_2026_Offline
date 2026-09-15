package com.covariant;

public class Animal {
	Animal getAnimal() {
		return new Animal();
	}
}

class Dog extends Animal {
	@Override
	Dog getAnimal() {
		return new Dog();

	}

	void Bark() {
		System.out.println("Dog.Bark()");
	}

	public static void main(String[] args) {
		Dog ad = new Dog();

		Dog result = ad.getAnimal();
		System.out.println(result);
	}
}