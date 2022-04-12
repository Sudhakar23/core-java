package com.core.java.company.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author SUDHAKAR
 * wipro interview
 */
public class AllCharCountInString {

	public static void main(String[] args) {
		String inputString = "abccccdddd";
		char charArr[] = inputString.toCharArray();
		
		
		int counter = 0;
		int x = 0;
		int y = 0;
		String str = "";
		for (int i = 0; i<=charArr.length; i++) {
				if(charArr[x] == charArr[y]) {
					counter++;
					y++;
				}
				else {
					str = str + charArr[x]+""+counter;
					x = y ;
					counter=0;
				}
		}
		
		str = str + charArr[x]+""+counter;
		System.out.println("str " +str);
	}
}
