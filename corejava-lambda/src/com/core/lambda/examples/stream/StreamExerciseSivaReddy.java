package com.core.lambda.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExerciseSivaReddy {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Abhishek", "Ritesh", "Sanjeev", "Abhishek");
		
//		names.stream().forEach(n -> System.out.println(n));
		names.stream().filter(name -> name.startsWith("R")).map(name -> name.toUpperCase()).collect(Collectors.toList()).forEach(name -> System.out.println(name));
//		System.out.println(collect);
//		System.out.println("==============");
		
		//Sorting
		names.stream().sorted().forEach(name -> System.out.println(name));
		System.out.println("==============");
		
		names.stream().anyMatch(name -> name.contains("Ritesh")); //  true if any match then
		names.stream().allMatch(name -> name.contains("Ritesh")); // false if all mathch then
		System.out.println(names.stream().filter(name -> name.contains("Riteshd")).findFirst()); // false if all mathch then
		System.out.println("==============");
		
		// Insertion. sorting is not provided with parallel stream
		// It uses multithreading concept to iterate over elts 
		names.parallelStream().forEach(e -> System.out.println(e));
		System.out.println("==============");
		
		//Generate random number
		Stream.generate(new Random()::nextInt).limit(2).forEach(rn -> System.out.println(rn));
		System.out.println("==============");
		
		//To generate unbounded elements
		Stream.iterate(5, n -> n + 5).limit(10).forEach(e -> System.out.println(e));
		System.out.println("==============");
		
		//Distinct
		names.stream().distinct().filter(n -> n.startsWith("R")).forEach(n -> System.out.println(n));
		System.out.println("==============");
		
		//Transforming using map
		names.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		names.stream().map(n -> n.valueOf(n)).forEach(n -> System.out.println(n));
		System.out.println("==============");
		
		// flatMap is used to convert complex datastructure to simple data structure
//		names.stream().flatMap(null);
		
		
		// Optional
		// Its important feature, it helps check null condition
		// Optional will be wrap around the value of the object 
		// There are several method present like isPresent(), get() 
		// Here API takes care of null 
		// To create optional 
		Optional<String> opt = Optional.ofNullable("");
		System.out.println(opt.isEmpty());
		System.out.println(opt.isPresent());
		System.out.println(opt.orElse("no data")); //if option has null then orElse string will be printed.
		System.out.println(opt.get()); // throw NoSuchElementException if no data present
		System.out.println("==============");
		
	}
}