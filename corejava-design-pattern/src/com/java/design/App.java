package com.java.design;

import java.util.List;

import com.java.design.builder.Account;
import com.java.design.builder.Address;
import com.java.design.builder.Name;

public class App {
	public static void main(String[] args) {
	//Account acc = new Account(email, id, firstName, middleName, surname, houseNo, street, zipcode, city)
		List<String> middleName = null; 
		Name name = new Name.Builder().firstName("Sudhakar").middleName(middleName).surname("prasad").build();
		Address address = new Address.Builder().houseNo(101).build();
		Account acc = new Account.Builder().id(1).email("sudhakar.prsd23@gmail.com").address(address).name(name).buld();
		System.out.println(acc.getName().getFirstName());
		
		
	}
}
