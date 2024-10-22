package com.java.stream.ramn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNameStartingStream {
	public static void main(String[] args) {
	
		List<String> strList = Arrays.asList("Ajay","Prakesh", "Rakesh", "Prem");
		List<String> flist = strList.stream().filter(str -> str.startsWith("P")).collect(Collectors.toList());
		flist.forEach(System.out::println); //consumer used as functinal interface 

	}
	
}
