package com.java.collection.jenkov;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamEx5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		
		list.stream()
			.map((String element) -> element.toUpperCase())
			.map((String element) -> element.toLowerCase())
			.forEach((String element) -> System.out.println(element));
		
		list.stream()
			.map(element -> element.toUpperCase())
			.map(element -> element.toLowerCase())
			.forEach(element -> System.out.println(element));
		
		list.stream()
			.map(String::toUpperCase)
			.map(String::toLowerCase)
			.forEach(System.out::println);
		
		
	}
}
