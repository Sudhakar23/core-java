package com.string;

import java.util.*;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "This is java language and we are studing java using Internet.";
		System.out.println(str1);// = "This is java language and we are studing java using Internet.";
		System.out.println(new StringBuffer(str1).reverse() +" ");
		String[] str2 = str1.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(new StringBuffer(str2[i]).reverse() +" ");
			
		}
	}
}