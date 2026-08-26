package com.hashcode.set;

import java.util.HashSet;
import java.util.Set;

class DemoInfo {

}

public class Test {

	public static void main(String[] args) {
		
		

		String s1 = "Hello";// String Object

		System.out.println("Hash Code for s1 is :" + s1.hashCode());// Hash Code s1 :69609650

		String s2 = "Hello";// String Object
		System.out.println("Hash Code for s2 is : " + s2.hashCode());// Hash Code s2 : 69609650

		
		System.out.println();

		Set<String> str = new HashSet<String>();
		str.add(s1);

		DemoInfo d1 = new DemoInfo();
		DemoInfo d2 = new DemoInfo();

		System.out.println(d1.hashCode() + " and " + d2.hashCode());// 951007336 and 2001049719
		System.out.println("Deno Code for d1 is : " + d1.hashCode());// Deno Code for d1 is : 951007336
		System.out.println("Deno Code for d2 is : " + d2.hashCode());// Deno Code for d2 is : 2001049719

	}
}
