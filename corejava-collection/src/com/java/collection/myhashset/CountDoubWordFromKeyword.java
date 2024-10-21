package com.java.collection.myhashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountDoubWordFromKeyword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String s[]=str.split(" ");
	Map<String, Integer> map=new HashMap<>();
	for (int i = 0; i < s.length; i++) {
		if (map.get(s[i])!=null) {
			int value=map.get(s[i]);
			map.put(s[i], ++value);
		}else
			map.put(s[i], 1);
	}
	System.out.println(map);
}
}
