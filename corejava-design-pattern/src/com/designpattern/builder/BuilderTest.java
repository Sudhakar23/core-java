package com.designpattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
//		Customer cust = new Customer.CustomerBuilder().setFirstName("abc").setLastName("xyz").setAge("one").build();
//		Customer cust = new Customer.CustomerBuilder().setFirstName("abc").setLastName("xyz").setAge("one").build();
		Customer cust = new Customer.CustomerBuilder().setFirstName("abc").setAge("one").build();
		System.out.println(cust.getFirstName());
		System.out.println(cust.toString());

	}

}
