package com.core.lambda.examples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
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
		
		System.out.println("=================");
		
		List<Person> peoplesPhone = new ArrayList();
		peoplesPhone.add(new Person("Warren", 120, Arrays.asList("1111", "1222")));
		peoplesPhone.add(new Person("Jeff", 150, Arrays.asList("2222", "2222")));
		peoplesPhone.add(new Person("Bill", 100, Arrays.asList("3333", "4444") ));
		peoplesPhone.add(new Person("Mark", 50, Arrays.asList("5555", "3333") ));
		
	
		List<List<String>> listOfPhone = peoplesPhone.stream().map(person -> person.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(listOfPhone);
		Set<String> phonesFlat = listOfPhone.stream().flatMap(phones -> phones.stream()).collect(Collectors.toSet());
		System.out.println(phonesFlat);
		Set<List <String>> phones = listOfPhone.stream().map(phonesList -> phonesList).collect(Collectors.toSet());
		System.out.println(phones);
		List<String> phFlat = phones.stream().flatMap(ph -> ph.stream()).collect(Collectors.toList());
		System.out.println(phFlat);

		System.out.println("=================");
		List<String> listOfPhoneFlat = peoplesPhone.stream().flatMap(person -> person.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(listOfPhoneFlat);
		System.out.println("=================*");
	
		
		System.out.println("=================");
		
//		listOfPhone.stream().
		
//		phones.stream().forEach(p -> System.out.println(p));
	}
}


