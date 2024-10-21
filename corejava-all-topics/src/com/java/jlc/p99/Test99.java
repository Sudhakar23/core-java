package com.java.jlc.p99;

public class Test99 {
	int a  = 10;

	public static void main(String[] args) {
		String s1 = "jlc",
				s2 = "jlcindia",
				s3 = "india",
				s4 = "jlc";
		String str1 = new String("jlc"),
				str2 = new String("jlcindia"),
				str3 = new String("india");
		String s11 = s1+s3,
				s12 = str1 + str3,
				s13 = str1 + "india",
				str14 = "jlc" + s3,
				str15 = "jlc" + "india";
		System.out.println(s1==s4);
		System.out.println(s2==s11);
		System.out.println(s1==str1);
		System.out.println(s1==str2);
		System.out.println(str2==str15);
		System.out.println(s2==str15);
		System.out.println(s2==str14);

	}

}
