package com.Employee;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee x, Employee y) {
		return x.salary.compareTo(y.salary); // descending order= y.salary.compareTo(x.salary);	}
	}
}
// x-> object to be inserted and y-> already existing object.
// to compare Double objects, using compareTo() of Double class->line no:8;