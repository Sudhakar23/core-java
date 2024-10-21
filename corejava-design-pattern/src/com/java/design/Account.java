package com.java.design;

import java.util.List;

public class Account {
	private int id;
	private String email;
	private String firstName;
	private List<String> middleName;
	private String surname;
	private int houseNo;
	private String street;
	private String zipcode;
	private String city;
	
	public Account(String email, int id, String firstName, List<String> middleName, String surname, int houseNo, String street, String zipcode, String city) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;	
		this.middleName = middleName;
		this.surname = surname;
		this.houseNo = houseNo;
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
	}
	
		
	
}
