package com.callable;

public class Driver3 {
	public String doSomething(int amount) {
		if (amount > 0) {
			return "SUCCESS";
		} else {
			return "FALIED";
		}
	}

	public static void main(String[] args) {

		Driver3 st = new Driver3();
		String reponse = st.doSomething(200);
		System.out.println(reponse);
	}

}
