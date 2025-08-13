package com.ocp.javase21.ch10.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
		
//		var list = List.of("monkey", "2", "chimp");
//		Stream<String> infinite = Stream.generate(() -> "chimp");
//		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
//		System.out.println(list.stream().anyMatch(pred)); // true
//		System.out.println(list.stream().allMatch(pred)); // false
//		System.out.println(list.stream().noneMatch(pred)); // false
//		System.out.println(infinite.allMatch(pred)); // true 
		
		
		
		//Iterating
//		int arr[] = {1,2,3,5,5,4};
//		Stream<int[]> of = Stream.of(arr);
//		of.forEach(ar -> System.out.println(ar));
//		Stream.of(arr).forEach(ar -> System.out.println(ar));
		//Stream.of(arr).forEach(System.out::println);
		
		
		
		//Reducing
//		Stream<String> stream = Stream.of("w", "o", "l", "f");
//		String reduce = stream.reduce("", (a,b) -> a+b ); //"" is identity, seed value
//		System.out.println(reduce);						  //   combines current result with current value.
		
//		Stream<Integer> streamInt = Stream.of();
//		Optional<Integer> sum = streamInt.reduce((a, b) -> a*b );
//		System.out.println(sum.isEmpty());
		
//		BinaryOperator<Integer> opr = (a,b) -> a+b;
//		Stream<Integer> empty = Stream.empty();
//		Stream<Integer> oneElt = Stream.of(3);
//		Stream<Integer> threeElt = Stream.of(2,3,4);
//		empty.reduce(opr).ifPresent(p -> System.out.println(p));;
//		oneElt.reduce(opr).ifPresent(System.out::println);;
//		threeElt.reduce(opr).ifPresent(p -> System.out.println(p));	
		
		
		
		//Collecting
//		Stream<String> stream = Stream.of("w", "o", "l", "f");
//		TreeSet<String> set =
//		//stream.collect(Collectors.toCollection(TreeSet::new));
//		Set<String> set1 = stream.collect(Collectors.toSet());
//		System.out.println(set1); // [f, l, o, w]
		
		
		
		//Using Common Intermediate Operations
		
		//Filtering
//		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//		s.filter(x -> x.startsWith("m")).forEach(System.out::println);
		
		
		//Removing Duplicates
//		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
//		s.distinct().forEach(System.out::println);

		
		//Restricting by Position
//		Stream<Integer> s = Stream.iterate(1, n -> n+1);
//		s.skip(5)  // skip first 5
//		.limit(5)  //  
//		.forEach(System.out::print);
		
		
		//Mapping
//		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//	  //s.map(String::length).forEach(System.out::print); // 676
//		s.map(x -> x.length()).forEach(str -> System.out.print(str));
		
//		List<String> zero = List.of();
//		var one = List.of("Bonobo");
//		//var one = List.of(1);
//		var two = List.of("Mama Gorilla"," " ,"a","Baby Gorilla");
//		//Stream<List<String>> of = Stream.of(zero,one,two);
//		Stream<List<? extends Object>> of = Stream.of(zero,one,two);
//		of.flatMap(m -> m.stream()).forEach(System.out::println);
//		System.out.println(of.flatMap(m -> m.stream()).count());
		
		
		//Concatenating Streams
//		Stream one = Stream.of("Bonobo");
//		Stream two = Stream.of("Mama Gorilla","Baby Gorilla");
//		Stream concat = Stream.concat(one, two);
//		concat.forEach(System.out::println);
		
		
		//Sorting
//		Stream<String> s = Stream.of("brown-", "bear-");
//		//s.sorted().forEach(System.out::println);
//		s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		//Non StreamAPI
//		var list = List.of("Toby", "Anna", "Leroy", "Alex");
//		List<String> filtered = new ArrayList<>();
//		for (String name: list)
//		if (name.length() == 4) filtered.add(name);
//		Collections.sort(filtered);
//		var iter = filtered.iterator();
//		if (iter.hasNext()) System.out.println(iter.next());
//		if (iter.hasNext()) System.out.println(iter.next());
		
//		//Using StreamAPI
//		var list = List.of("Toby", "Anna", "Leroy", "Alex");
//		list.stream()
//		.filter(name -> name.length() == 4)
//		.sorted()
//		.limit(2)
//		.forEach(System.out::println);
//		
//		//Stream.iterate(1, n -> n+1);
//		Stream.generate(() -> "a")
//		.filter(x -> x.length()==4)
//		.limit(200)
//		.sorted()
//		.forEach(System.out::println);
		
		//Peek
//		var stream = Stream.of("black bear", "brown bear", "grizzly");
//		long ln = 
//				stream.filter(ani -> ani.startsWith("b"))
//				.peek(ani -> System.out.println(ani))
//				.count();
//		System.out.println(ln);
		
		
//		var numbers = new ArrayList<>();
//		var letters = new ArrayList<>();
//		numbers.add(1);
//		numbers.add(3);
//		letters.add('a');
//		letters.add('c');
//		Stream<List<?>> alphaNum = Stream.of(numbers, letters);
//		alphaNum.peek(x -> x.size())
//		.map(List::size).forEach(System.out::println);
		
		
		
		
	}

}
