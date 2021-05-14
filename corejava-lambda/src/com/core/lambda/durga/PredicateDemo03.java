package com.core.lambda.durga;

import java.util.function.Predicate;

//Program to display name start with some specified character.
public class PredicateDemo03 {
	public static void main(String[] args) {
		String[] names = {"Sunny", "Bunny", "Kajal", "Kartik", "Akshay"};
		Predicate<String> preStr = str -> str.charAt(0) == 'K' || str.charAt(0) == 'k';
		m1(preStr, names);
	}
	
	public static void m1(Predicate<String> preStr, String[] strArr) {
		for(String string : strArr) {
			if(preStr.test(string)) {
				System.out.println(string);
			}
		}
	}	
}
