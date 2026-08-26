package com.handle1;

public class Student {
	static int test() {
		try {
			//	System.out.println("try");
				return 10;
				
			}
			finally {
				//System.out.println("Finally");
				return 20;
			}

		
	}

	public static void main(String[] args) {
		System.out.println(test());
		
		try {
			System.out.println("try");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
