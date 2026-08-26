package com.treeset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Amazon implements Comparable<Amazon> {
	String name;
	double price;
	String status;
	String id;

	public Amazon(String name, double price, String status, String id) {
		super();
		this.name = name;
		this.price = price;
		this.status = status;
		this.id = id;
	}

	@Override
	public int compareTo(Amazon o) {
		int result = this.id.compareTo(o.id);
		return result;
	}

	public static void main(String[] args) {
		List<Amazon> set = new ArrayList<Amazon>();

		Amazon e1 = new Amazon("Nokiya", 12600, "BLR", "123");
		Amazon e2 = new Amazon("Motorola", 18000, "DL", "1234");
		Amazon e3 = new Amazon("OOPS", 12800, "MUB", "12345");
		Amazon e4 = new Amazon("Samsung", 12400, "GT", "1456");
		Amazon e5 = new Amazon("Samsung", 12200, "GT", "12367");

		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);

//		Set<Integer> id = new HashSet<Integer>();
//		id.add(123);
//		id.add(4321);
//		id.add(123);
//		System.out.println(set.size());

		Iterator<Amazon> itr = set.iterator();

		while (itr.hasNext()) {
			Amazon amazon = itr.next();

			System.out.println(amazon.id + ", " + amazon.name + " , " + amazon.price + " , " + amazon.status);

		}

	}

}
