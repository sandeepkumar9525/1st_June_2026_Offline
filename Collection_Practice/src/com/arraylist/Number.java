package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Number {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(Integer num :list) {
			System.out.println(num);
		}
		
		
		System.out.println(list.contains(30));
		
		for(int i = 2; i< list.size(); i++) {
			System.err.println(list.get(i));
			
			
		}
		System.out.println(list.size());
		
	}

}
