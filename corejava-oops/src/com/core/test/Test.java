package com.core.test;

public class Test {
	public static void main(String[] args) {
		final Customer c = new Customer("John");
		
		System.out.println(c.getName());
		System.out.println(c.getName());
	}
}

class Customer {
	private String name;

	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		String temp = this.name;
		this.name = "XXX";
		return temp;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}