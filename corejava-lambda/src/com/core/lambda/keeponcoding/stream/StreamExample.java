package com.core.lambda.keeponcoding.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> peoples = new ArrayList();
		peoples.add(new Person("Warren", 120));
		peoples.add(new Person("Jeff", 150));
		peoples.add(new Person("Bill", 100 ));
		peoples.add(new Person("Mark", 50 ));
		
		List<Person> millionarClub = new ArrayList();
		
		
		
		// Creating hundres club old way
//		for(Person person : persons) {
//			System.out.println(person);
//			if(person.getBillion() >= 100) {
//				millionarClub.add(person);
//			}
//		}

//		millionarClub.forEach(person -> System.out.println(person.getName()));
		
		
		
		// Creating hundres club stream way
//		List<Person > hundersClub = persons.stream()
//			.filter(person -> person.getBillion() >= 100)
//			.collect(Collectors.toList());
//		 	
//		hundersClub.forEach(person -> System.out.println(person.getName()));
		
		
		// Sorting names alphabetically 
		
		List<Person> sortedList = peoples.stream() 
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		
		sortedList.forEach(p  -> System.out.println(p.getName()));
	}
}

class Person {
	private String name;
	private int billion;

	public Person(String name, int billion) {
		super();
		this.name = name;
		this.billion = billion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBillion() {
		return billion;
	}

	public void setBillion(int billion) {
		this.billion = billion;
	}
}
