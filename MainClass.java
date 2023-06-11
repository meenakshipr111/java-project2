package com.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 =new Employee(108,"meenakshi",4.5);
		Employee e2 =new Employee(105,"gouramma",3.5);
		Employee e3 =new Employee(107,"ramya",4.5);
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("---------------------");
		Scanner ip= new Scanner(System.in);
		int choice=ip.nextInt();
		System.out.println("1:sortEmployeeById\n2:sortEmployeeByName");
		System.out.println("3:sortEmployeeBySalary\n:Enter choice");
		switch(choice) {
		case 1:
			Collections.sort(list, new SortEmployeeById());
			for(Employee e: list) {
				System.out.println(e);
			}
			break;
		case 2:
			Collections.sort(list, new SortEmployeeByName());
			for(Employee e: list) {
				System.out.println(e);
			}
			break;
		case 3:
			Collections.sort(list, new SortEmployeeBySalary());
			for(Employee e: list) {
				System.out.println(e);
			}
			break;
		default:
		}
	}

}
