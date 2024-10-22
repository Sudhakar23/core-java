package com.java.stream.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCalculate {

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Mumbai","Chennai","Mumbai","Chenai","Bangalore","Bangalore","Bangalore","Chennai","Bangalore");
		Set<String> citySet= new HashSet(cityList);
		for (String cityUnique : citySet) {
			if(cityList.contains(cityUnique)) {
				System.out.println(cityUnique +" " +Collections.frequency(cityList, cityUnique));
			}
		}
		
	  //Map<String, Long> collect = cityList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> collect = cityList.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
		System.out.println(collect);
		
	}

}
