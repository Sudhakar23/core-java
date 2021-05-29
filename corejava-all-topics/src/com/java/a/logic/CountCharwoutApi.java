package com.java.a.logic;
public class CountCharwoutApi {
	public static void main(String[] args) {
//		String userInput = "ANAFDQWFGGG";
		String userInput = "ANAGG";
		String input = userInput.toLowerCase();// Make your input toLowerCase.
		int[] arrChar = new int[26];
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int value = (int) ch;
			if(value >= 97 && value <= 122) {
				arrChar[ch - 'a']++;
			}
		}
		for(int i = 0; i < arrChar.length; i++) {
			if(arrChar[i] > 0) {
				char ch = (char) (i + 65);
				System.out.println(ch + " : " + arrChar[i]);   // Show the result.
			}
		}
	}
}
