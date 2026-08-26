package com.linkhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Drive {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("BLR");
		set.add("GGN");
		set.add("PTN");
		set.add("MUB");
		set.add("CHE");
		System.out.println(set);
	}

}
