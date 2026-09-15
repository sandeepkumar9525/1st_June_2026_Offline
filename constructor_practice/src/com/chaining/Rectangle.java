package com.chaining;

public class Rectangle {
	private int width;
	private int height;
	
	
	public Rectangle() {
		this(1,1); // call the two - parameter constructor
	}
	
	public Rectangle(int width, int height) {
		this.width= width;
		this.height= height;
	}
	
	public void display() {
		System.out.println("Width : " + width);
		System.out.println("Height : " + height);
	}
	public static void main(String[] args) {
		Rectangle rt = new Rectangle(4,10);
		rt.display();
	}
	

}
