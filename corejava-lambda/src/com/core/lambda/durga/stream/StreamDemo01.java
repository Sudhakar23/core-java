package com.core.lambda.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(2);list.add(5);
		list.add(4);list.add(7);
		list.add(6);list.add(9);
		System.out.println(list);
		
		//filter mechanism
		//Get even numbers 
		List<Integer> listEven = list.stream().filter(i -> i %2 == 0 ).collect(Collectors.toList());
		System.out.println(listEven);
		
		//Mapping mechanism
		//Changing values in list
		List<Integer> listChange = list.stream().map(i -> i *2).collect(Collectors.toList());
		System.out.println(listChange);
		
		//Count 
		long count = list.stream().filter(i -> i > 5).count();
		System.out.println(count);
		System.out.println(list);
	}

}
