package com.core.lambda.jenkov.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample5 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		list.add("Element 4");
		
		
		// Method chaining stream api has designed to support. 
		// call the methods directly on the return value of previous method
		
		// more compact code using Method reference
		list.stream()							
			.map( String::toUpperCase) 	// map called to return of stream which is stream
			.map( String::toLowerCase)		// map called to return of map which is stream
			.forEach( System.out::println); 		// forEach is called since again map return stream
	}

}
