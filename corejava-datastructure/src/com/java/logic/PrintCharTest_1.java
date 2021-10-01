package com.java.logic;

class Print1 {
	void show(int acc, char ch) {
		for (int i = 0; i < acc; i++) {
			System.out.println(ch);
		}
	}
}

public class PrintCharTest_1 {
	public static void main(String[] args) {
		Print1 p = new Print1();
		p.show(4, 'A');
	}
}
