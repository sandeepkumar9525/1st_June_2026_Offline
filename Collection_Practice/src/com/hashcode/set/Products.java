package com.hashcode.set;

import java.util.HashSet;
import java.util.Set;

public class Products {

	public static void main(String[] args) {
		Set<String> mk= new HashSet<String>();
		mk.add("iPhone17");
		mk.add("samsungs26");
		mk.add("lg32");
		mk.add("mac-pro324");
		
		
		int hash ="mac-pro324".hashCode();
		int spreadHash= hash^(hash >>> 16);
		int bucketNumber = spreadHash & 15;
		
		System.out.println(bucketNumber);
		System.out.println(mk.hashCode());
		System.out.println(mk);

	}

}
