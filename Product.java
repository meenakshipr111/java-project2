package com;

public class Product {
	private String name;
	private int quantity;
	private int cost;
	
	public Product(String name,int quantity,int cost){
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getcost() {
		return cost;
	}
	
	public void setcost(int cost) {
		this. cost=cost;
	}
	
	public String toSting() {
		return "Name: "+name+ " Quantity: "+quantity+ " Cost: "+cost;
	}

}
