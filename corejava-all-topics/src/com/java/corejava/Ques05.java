package com.java.corejava;

public class Ques05 {
	public int aMethod() {
		int i = 0;
		i++;
		return i;
	}

	public static void main(String[] args) {
		Ques05 ques = new Ques05();
		ques.aMethod();
		int j = ques.aMethod();
		System.out.println(j);
	}
}
