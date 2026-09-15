package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
	int id;
	public Test(int id) {
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Test && id==((Test) obj).id;
	}
	public int hashCode() {
		return id;
		
	}

	public static void main(String[] args) {
		
		Set<Test>  set =  new HashSet<>();
		
		set.add(new Test(123));
		set.add(new Test(234));
		set.add(new Test(654));
		set.add(new Test(987));
		
		System.out.println(set.hashCode());
		
		
	}

}
