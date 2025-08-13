package com.ocp.javase21.ch10.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingTogetherThePipeline {

	public static void main(String[] args) {
		//Putting Together the Pipeline Page:867
//		var list = List.of("Toby", "Anna", "Leroy", "Alex");
//		list.stream().filter(n -> n.length() == 4)
//		.sorted()
//		//.limit(2)
//		.forEach(System.out::println);
		
//		Stream.generate(() -> "Elsa")
//		.filter(n -> n.length() == 4)
//		.limit(2)
//		.sorted()
//		.forEach(System.out::println);
		
//		long count = Stream.of("goldfish", "goldwwwfish", "finch") // 23-25 1st Pipeline
//			.filter(s -> s.length()> 5)
//			.collect(Collectors.toList())   // Terminal operation
//			.stream()						// 26-27 2nd Pipeline
//			.count();						// Terminal operation
//			System.out.println(count);
			
			
			List<String> count1 = Stream.of("goldfish", "goldwwwfish", "finch") // 23-25 1st Pipeline
					.filter(s -> s.length()> 5)
					.collect(Collectors.toList());   // Terminal operation
			System.out.println(count1);
			long count = count1.stream()			// 
					.count();						// Terminal operation
					System.out.println(count);	
	}

}
