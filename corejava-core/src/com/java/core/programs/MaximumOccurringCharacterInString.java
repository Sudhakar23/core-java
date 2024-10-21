package com.java.core.programs;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacterInString {

	public static void main(String[] args) {
		String str = "aaaaaabbbcccc";
//		char[] charArray = string.toCharArray();
		int[] arr = new int[127];
				
		for (int i = 0; i < str.length(); i++) {
			
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
			
			//with char array
			//arr[charArray[i]] = arr[charArray[i]]+1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println((char)i +" : "+arr[i]);				
			}
		}
		int max = -1;
		char ch = ' ';
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
			
			//with char array
//			if(arr[charArray[i]] > max) {
//				max = arr[charArray[i]];
//				ch = charArray[i];
//			}
		}
		System.out.println(ch +" : " + max);
 	}
}
