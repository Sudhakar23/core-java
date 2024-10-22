package com.java.stream.jenkov;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample3 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		list.add("Element 4");
		
		// Method chaining stream api has designed to support. 
		// call the methods directly on the return value of previous method
		list.stream()							
			.map((String element) -> {			// map called to return of stream which is stream
				return element.toUpperCase();
			})
			.map((String element) -> {			// map called to return of map which is stream 
				return element.toLowerCase();
			})
			.forEach((String element) -> {		// forEach is called since again map return stream
				System.out.println(element);
			}); 
	}

}
