package com.string;

import java.util.*;

public class CenturiLinkQ {
	public static void main(String[] args) {
		String str = "1,2,3,400,4,5,5,5,6,6,67,8,9,9,9";
		System.out.println(findUnique(str));
	}
	public static String findUnique(String input){
		String output = "";
		List list = Arrays.asList(input.split(","));
		Set set = new LinkedHashSet(list);
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			output = output+it.next()+",";
		}
		return output;
	}
	
}
