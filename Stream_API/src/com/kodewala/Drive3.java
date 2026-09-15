package com.kodewala;

public class Drive3 {

	public static void main(String[] args) {
	String input = "Sandeeps";
	
	Character output = input.chars().mapToObj(c -> (char) c)
			.filter(ch -> input.indexOf(ch)  == input.lastIndexOf(ch)).findFirst().get();
	
	
	System.out.println(output);

	}

}
