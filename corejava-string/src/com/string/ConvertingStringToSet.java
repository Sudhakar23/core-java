package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingStringToSet {
	public static void main(String[] args) {
		String str1 = "This is java language and we are studing java using Internet.";

		String str2[] = str1.split(" ");
		List list = new ArrayList();
		for (int j = 0; j < str2.length; j++) {
			list.add(str2[j]);
		}
		System.out.println(list.size() +" "+ list);
		
		Set set = new HashSet();
		for (int j = 0; j < str2.length; j++) {
			set.add(str2[j]);
		}
		System.out.println(set.size() +" "+ set);
		
//		Set set = new HashSet();
//		set.add(list.get(2));
		
//		for (int i = 0; i < str2.length; i++) {
//			list.add(str2[i]);
//		}
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		
//		System.out.println(list.toString());
//		Set set = null;
		
//		for(int i = 0; i<list.size(); i++){
//			set = (Set)list.get(i);
//			set = str.split(" ");
//		}
		
	}
}
