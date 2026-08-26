package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.set(3, 5);
		//list.remove(2);
		
		list.addAll(0,List.of(6, 7, 8,9));
		
		
		
		//System.out.println(list);
		
		ListIterator<Integer> it =  list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	

}
