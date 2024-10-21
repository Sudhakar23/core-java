package com.java.jlc.findstr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {
	public static void main(String[] args) {
		String str = "We are studing java in java classes java.";
		Pattern p = Pattern.compile("java");
		Matcher m = p.matcher(str);
		
		int count = 0;
		while(m.find()){
			count++;
		}
		System.out.println(count);
	}
}
