package com.kodewala;


import java.io.Serializable;

class User implements Serializable {
	private static final long id = 1l;

	private String name;
	private transient String password;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{User Name : " + name + ". Password : " + password + " '}";
	}
}

public class Serialization {

	public static void main(String[] args) {

		String fileName = "user.ser";
		User st = new User("Sandeep", "St1234@");
		System.out.println(st.toString());
		
	}

}
