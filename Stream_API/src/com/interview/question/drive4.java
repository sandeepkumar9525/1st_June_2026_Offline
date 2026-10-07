package com.interview.question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class drive4 {

	public static void main(String[] args) {
		
		String sentence = "Kodewala is java Training Academy"; 
		
		String result =		Arrays.stream(sentence.split(", ")).map(word -> new StringBuilder(word)
						.reverse().toString()).collect(Collectors.joining(""));
				
				System.out.println(result);
	}

}
