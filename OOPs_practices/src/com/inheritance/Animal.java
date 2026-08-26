package com.inheritance;

public class Animal {
	public void what() {
		System.out.println("Eat");
	}

}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog is bark");
	}
}
class Puppy extends Dog{
	public void play() {
		System.out.println("Puppy.play()");
	}
	public static void main(String[] args) {
		Puppy pa = new Puppy();
		pa.what();
		pa.sound();
		pa.play();
	}
}