package com.compare2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		int result = e1.name.compareTo(e2.name);
		return result;

	}

}
