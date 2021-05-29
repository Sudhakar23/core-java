package com.java.collection.myhashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDoupCharFromKeybord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str= sc.nextLine();
	Map<Character, Integer> map=new HashMap<>();
	for (int i = 0; i < str.length(); i++) {
		if (map.get(str.charAt(i))!=null) {
			int value=map.get(str.charAt(i));
			map.put(str.charAt(i), ++value);
		}else
			map.put(str.charAt(i), 1);
	}
	System.out.println(map);
} 
}
