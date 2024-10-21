package com.java.core.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStringListManually {

	public static void main(String[] args) {

//		List("Za", "ab", "AB", "Sa", "1ab", "Ab", "!Ab");
		List<String> list = Arrays.asList("Za", "ab", "AB", "Sa", "1ab", "Ab", "!Ab");
		List<String> sortedList = list.stream().sorted().map(s -> s.toString()).collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(sortedList);

		List<String> sortedStrList = new ArrayList();
		String[] strArr = new String[list.size()];
		for(int i = 0; i<list.size(); i++) {
			strArr[i] = list.get(i);
		}
		
		
		List<String> listStr = Arrays.asList("Za", "ab", "AB", "Sa", "1ab", "Ab", "!Ab");
		for (int i=0; i< listStr.size(); i++) {
			if(i < listStr.size()) {
				int res = listStr.get(i).compareTo(list.get(i+1));
				System.out.println(res);
			}
			
		}
//		String 
		
		
		
		
		
	}

}
