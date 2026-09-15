package com.handle.exception;

public class Login {
	static void login(String userName, String userPassword) throws Exception {
		if (!userName.equals("Admin") || !userPassword.equals("1234")) {
			throw new Exception("Invalid Password try agin");
		}
		System.out.println(" login is successfull ");
	}

	public static void main(String[] args) {

		try {
			login("Admin", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
