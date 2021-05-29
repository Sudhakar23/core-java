package com.string;

public class String15 {
	public static void main(String[] args) {
		
	
	String someString = new String("Love thy neighbor");
    System.out.println(someString);
    char[] someChar = someString.toCharArray();
    int j = someChar.length - 1;
    char temp;
    for (int i = 0; i <= someChar.length / 2; i++) {
        temp = someChar[i];
        someChar[i] = someChar[j];
        someChar[j] = temp;
        j--;
    }
    someString = new String(someChar);
    System.out.println(someString);
}
}
