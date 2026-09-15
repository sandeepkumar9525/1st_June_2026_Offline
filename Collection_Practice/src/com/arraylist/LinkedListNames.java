package com.arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListNames {

	public static void main(String[] args) {
	
		List<Integer> link = new LinkedList<Integer>();
		link.add(100);
		link.add(200);
		link.add(300);
		link.add(400);
		link.add(500);
		System.out.println(link);
		
		link.getFirst();
		System.err.println( "Get first : "+link.getFirst());
		System.out.println(link);
		
		System.err.println("Get last: "+link.getLast());
		
		System.err.println("Remove First : "+link.removeFirst());
		System.out.println(link);
		System.err.println( "Remove last :"+ link.removeLast());
		System.out.println(link);
	}

}
