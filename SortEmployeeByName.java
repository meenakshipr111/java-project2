package com.Employee;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {
	@Override
	public int compare(Employee x,Employee y) {
		return x.name.compareTo(y.name); // descending order=y.name.compareTo(x.name)
	}

}
// x-> object is to be inserted and y-> already object existing
//to compare String objects,
//we are using compareTO() of string class-> line no: 8