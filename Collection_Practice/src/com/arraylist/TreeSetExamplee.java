package com.arraylist;

import java.util.TreeSet;

public class TreeSetExamplee {

	public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<String>();
	
	tree.add("Fan");
	tree.add("Chair");
	tree.add("Charger");
	tree.add("Laptop");
	tree.add("Table");
	tree.add("SmartPhone");
	tree.add("Chair");// duplicate will be removed
	System.out.println(tree);
	
	}

}
