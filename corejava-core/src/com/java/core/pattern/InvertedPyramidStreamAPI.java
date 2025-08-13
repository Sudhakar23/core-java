package com.java.core.pattern;

import java.util.stream.IntStream;

public class InvertedPyramidStreamAPI {

	public static void main(String[] args) {
		int rows = 7;
		IntStream pattern = IntStream.rangeClosed(1, rows);
		pattern.mapToObj(x -> " ".repeat(rows-x) + "*".repeat(2*x -1 ))
//		pattern.forEach(x -> System.out.println(x));
		.forEach(System.out::println);
		
		
	}

}
