package com.shallow;

public class Demo implements Cloneable {
	String id;
	String name;

	public Demo(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Demo st = new Demo("St123", "Sandeep");

		Demo st2 = (Demo) st.clone();
		System.out.println(st.id);
		System.out.println(st.name);

		System.out.println();

		System.out.println(st2.id);
		System.out.println(st2.name);

	}

}
