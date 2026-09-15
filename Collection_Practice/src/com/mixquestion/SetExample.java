package com.mixquestion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// HashSet : Unordered ignores duplicate
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(101); // duplicate not Allowed
		System.out.println("Hash Set : "+set);
		
		//linkedHashSet: Preserves insertion order
		Set<Integer> link = new LinkedHashSet<Integer>();
		link.add(40);
		link.add(12);
		System.out.println("Linked Hash Set :"+link);
		
		//TreeSet : Automatically sorts elements
 		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(43);
		tree.add(2);
		tree.add(10);
		System.out.println("Tree Set : "+tree);

	}

}
