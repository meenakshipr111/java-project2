package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements  DepartmentalStore{
	
//	key->produt Id->Integer, & Value->product Instance->product
	Map<Integer,Product> db=new LinkedHashMap<Integer,Product>();
	Scanner scan= new Scanner(System.in);
	int totalBill=0;
	@Override
	public void addproduct() {
		db.put(1, new Product("chocolates",10,20));
		db.put(2, new Product("Biscuits",20,20));
		db.put(3, new Product("IceCream",30,50));
	}

	@Override
	public void displayproduct() {
		Set<Integer> keys=db.keySet();
		for(int key:keys) {
			Product p=db.get(key);
			System.out.println("Enter "+key+" to order " +p.getname());
			System.out.println("Available Quantity "+p.getquantity());
			System.out.println("Cost :Rs."+p.getcost());
			System.out.println("------------");
		}


	}

//	@Override
//	public void buyproduct() {
//
//	}
//
//	@Override
//	public void checkout() {
//
//
//	}


}
