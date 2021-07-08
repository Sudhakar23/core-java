package com.core.io.scjp;

public class StrTest {
	public static void main(String[] args) {
		String st = new String("abcdef");
		System.out.println(st.replace('c', 'z'));
		System.out.println(st);
		
		
		
		
		
		
		StringBuffer str = new StringBuffer("abcdef");
		str.replace(0, 4, "z");
		System.out.println(str);
		
	}
	
}
