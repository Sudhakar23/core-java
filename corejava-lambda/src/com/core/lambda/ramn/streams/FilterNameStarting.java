package com.core.lambda.ramn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNameStarting {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Ajay","Prakesh", "Rakesh", "Prem");
		System.out.println(getFilterList(strList));
	}
	public static List<String> getFilterList(List<String> listStr){
		
		List<String> returnList = new ArrayList();
		for(String str :listStr) {
			if(str.startsWith("P")) {
				returnList.add(str);
			}
		}
		return returnList;
	}
}
