package com.java.corejava;

class Base {
	Base() {
		System.out.println("Base");
		System.out.println("Ques10");
	}
}

public class Ques10 extends Base {
	public static void main(String[] args) {
		new Ques10();
		//new Base();
	}
}
