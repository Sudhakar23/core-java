package com.java.corejava;

public class Ques5 {
	public int aMethod() {
		 int i = 0;
		i++;
		return i;
	}

	public static void main(String[] args) {
		Ques5 ques = new Ques5();
		ques.aMethod();
		int j = ques.aMethod();
		System.out.println(j);
	}
}
