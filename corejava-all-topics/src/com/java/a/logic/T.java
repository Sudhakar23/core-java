package com.java.a.logic;
public class T {
	public static void main(String[] args) {
		int arrChar[] = {12, 3, 34};
		char ch = 'z';
		System.out.println('a'+1);
		arrChar[2]++;
		System.out.println(arrChar[2]);
//		if(value >= 97 && value <= 122) {
			arrChar[ch - 'a']++;
			System.out.println(arrChar);
//		}
	}
}
