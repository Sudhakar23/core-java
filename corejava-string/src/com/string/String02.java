package com.string;

public class String02 {
	public static void main(String[] args) {
		String str = "abcdef";
		reverse(str);
	}
	public static void reverse(String word) {
	    char[] chs = word.toCharArray();

	    int i=0, j=chs.length-1;
	    while (i < j) {
	        // swap chs[i] and chs[j]
	        char t = chs[i];
	        chs[i] = chs[j];
	        chs[j] = t;
	       i++; j--;
	    }
	    System.out.println(chs);
	}
}