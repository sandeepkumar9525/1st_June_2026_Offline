package com.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		
		list.add("Gava");
		list.add("Banana");
		list.add("D");
		list.add("V");
		list.add("Z");
		list.add("T");
		list.add("C");
	//	list.add(null); // dose not allowed null 
		
		
		Collections.sort(list);
	
		System.out.println(list);

	}

}
