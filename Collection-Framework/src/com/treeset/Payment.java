package com.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Payment implements Comparable<Payment> {

	String refId;

	Payment(String refId) {
		this.refId = refId;

	}

	@Override
	public int compareTo(Payment o) {
		int result = this.refId.compareTo(o.refId);
		
		//System.out.println(this.refId +" , " + o.refId + " nad result is " + result);
		
		return result;
	}

	public static void main(String[] args) {
		Set<Payment> set = new TreeSet<Payment>();
		
		Payment e1= new Payment("ABCD");
		Payment e2= new Payment("ABCDE");
		Payment e3= new Payment("ABC");
		Payment e4= new Payment("ABCDG");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println("Size "+set.size());
		
		Iterator<Payment> itr = set.iterator();
		
		while(itr.hasNext()) {
			Payment payment = itr.next();
			
			System.out.println(payment.refId);
			
			
		}
		
		
	}

}
