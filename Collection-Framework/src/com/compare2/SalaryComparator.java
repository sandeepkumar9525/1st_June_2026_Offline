package com.compare2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee c1, Employee c2) {

		return Integer.compare(c1.salary, c2.salary);

	}

}
