package com.core.regex;

import java.util.regex.Pattern;

public class RegExSplitDemo {
	public static void main(String[] args) {
		String str = "www.durgasoft.com";
		Pattern p = Pattern.compile("[.]");
		String[] arr = p.split(str);
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
