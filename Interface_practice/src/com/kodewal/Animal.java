package com.kodewal;

public interface Animal {

	void makeSound();

}

class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog is Bark");
	}
	public static void main(String[] args) {
		Animal st  = new Dog();
		st.makeSound();
	}
	
}