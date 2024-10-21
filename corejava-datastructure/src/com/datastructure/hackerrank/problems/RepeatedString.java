
package com.datastructure.hackerrank.problems;

public class RepeatedString {
	public static void main(String[] args) {
		
		//ans = q * (freq of a in String) + (freq of a in substing of length in r)
		// q -> quocent 
		String test = "abcabcabcabcabca";
		
		
		System.out.println(getLetterCount(test, test.length()));
		
		
	}
	
	public static long getLetterCount(String string, long strLength){
		long count=0;
		
		for(int i = 0; i < strLength; i++) {
			if(string.charAt(i) == 'a') {
				count++;
			}
		}
		string.length();
		
		
		
		return count;
	}
	
}
