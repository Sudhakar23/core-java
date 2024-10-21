package com.java.jlc.tokenizer;

import java.util.StringTokenizer;

public class Lab12 {
	public static void main(String[] args) {
//		String str = "Welcome to java leanring center to learn java and advance java.Thankyou";
//		StringTokenizer st = new StringTokenizer(str); 
//		while (st.hasMoreTokens()) {
//			System.out.print(st.hasMoreTokens() +" : ");
//	         System.out.println(st.nextToken());
//	     }
		System.out.println("===========================================");
//		String res[] = str.split(".");
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);
//		}
		String str2 = "We are here to learn java in JLC along with advance java.";
		StringTokenizer sToken = new StringTokenizer(str2,"java"); 
		while (sToken.hasMoreTokens()) {
			System.out.print(sToken.hasMoreTokens() +" : ");
	        System.out.println(sToken.nextToken());
	     }
	}
}
