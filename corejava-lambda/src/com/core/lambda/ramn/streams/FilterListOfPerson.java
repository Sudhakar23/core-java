package com.core.lambda.ramn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterListOfPerson {
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person(01, "John", 80), new Person(02, "Umesh", 35), new Person(03, "Karthik", 36), new Person(04, "Sudhakar", 40)
				);
		System.out.println(getPersonByName(persons, "Karthik").getName());
		
		
		//Java8 Streams API
		
		Optional<Person> findFirst = persons.stream().filter(person -> person.getName().equals("Uasmesh")).findFirst();
		System.out.println(findFirst.get().getName());
	}
	private static Person getPersonByName(List<Person> persons, String name) {
		
		for (Person person : persons) {
			if(person.getName().equals(name)) {
				return person;
			}
				
		}
		
		return null;
	}
}


class Person{
	
	
	private int id;
	private String name;
	private int age;
	
	Person(){}
	
	Person(int id, String name, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}