package com.java.typingcode;

class RR {
	static RR sc;
	private RR() {
	}
	static {
		sc = new RR();
	}
	public static RR m1() {
		return sc;
	}
}
public class RRR {
	public static void main(String[] args) {
		RR sc = RR.m1();
		RR sc1 = RR.m1();
		System.out.println(sc.hashCode());
		System.out.println(sc1.hashCode());
	}
}