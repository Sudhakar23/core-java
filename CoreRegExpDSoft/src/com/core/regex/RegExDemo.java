package com.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		int count = 0;

//		String x = "[^a-zA-Z0-9]";
		String x = "a*";
		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher("ababaaba");

//		String x = ".";
//		Pattern p = Pattern.compile(x);
//		Matcher m = p.matcher("a7b @z#9");
		
		while(m.find()) {
			System.out.println("Start -  "+m.start() +" : " +m.group());
			count++;
		}
		System.out.println("The number of count -- " +count);
	}
}
