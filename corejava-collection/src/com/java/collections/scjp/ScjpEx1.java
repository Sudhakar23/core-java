package com.java.collections.scjp;

public class ScjpEx1 {
	public String[] m1(){
		return new String[]{"qqqqq","rrrr"};
	}
public static void main(String[] args) {
	ScjpEx1 s=new ScjpEx1();
	String[] f=s.m1();
	//System.out.println(s.m1());
	for (String string : f) {
		System.out.println(string);
	}
}
}
