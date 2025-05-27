package com.ocp.javase21.ch10.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamIntro {

	public static void main(String[] args) {
//		var list = List.of("a","b","c");
//		System.out.println(list);
//		list.forEach( l -> System.out.println(l));
//		Stream<String> stream = list.stream();
//		System.out.println(stream);
		
		// Stream to generate random number, Infinite numbers gets generated.
//		Stream<Double> randoms = Stream.generate(Math::random); 
		
//		System.out.println("count " +randoms.count());
		
//		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
//		Stream<Integer> oddNumbersunder100 = Stream.iterate(1, n -> n < 100, n -> n + 2);
//		System.out.println(oddNumbersunder100.count());
		
		//Finding the Minimum and Maximum
//		Stream<String> s = Stream.of("monkey", "app", "bonobo");
//		Optional<String > min = s.min((s1, s2) -> s1.length() - s2.length() );
//		min.ifPresent(minStr -> System.out.println(minStr));
		
		// findAny() and findFirst()
//		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//		Stream<String> infinite = Stream.generate(() -> "Chimp");
//		s.findFirst().ifPresent(System.out::println);
//		infinite.findAny().ifPresent((any) -> System.out.println(any));
		
		var list = List.of("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
//		System.out.println(list.stream().anyMatch(pred)); // true
//		System.out.println(list.stream().allMatch(pred)); // false
//		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.allMatch(pred)); // true 
		
	}

}
