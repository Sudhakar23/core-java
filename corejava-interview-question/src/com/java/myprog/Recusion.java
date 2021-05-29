package com.java.myprog;

public class Recusion {
public static void main(String[] args) {
	String r="RUPSI";
	 m1(r, 3);
}
static void m1(String r, int i){
	
	if (i>0) {
		System.out.println(r);
		m1(r, i-1);
	}
}
}
