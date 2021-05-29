package com.java.a.logic;

class Print {
	void show(int acc, char ch) {
		for (int i = 0; i < acc; i++) {
			System.out.println(ch);
		}
	}
}

public class PrintCharTest {
	public static void main(String[] args) {
		Print p = new Print();
		p.show(4, 'A');
	}
}
