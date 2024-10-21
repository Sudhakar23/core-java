package com.core.lambda.jenkov.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");
		list.add("Element 4");
		
		Stream<String> stream = list.stream();
		
		Stream<String> lowerCase = stream.map((String element) -> {
			return element.toLowerCase();
		});
		
		Stream<String> upperCase = lowerCase.map((String elt) -> {
			return elt.toUpperCase();
		});
		
		upperCase.forEach((String element)->{
			System.out.println(element);
		});
	}

}
