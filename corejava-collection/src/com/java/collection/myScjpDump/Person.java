package com.java.collection.myScjpDump;

class TestSet4 {
	private String name;

	public TestSet4(String name) {
		this.name = name;
	}

	public boolean equals(TestSet4 p) {
		return p.name.equals(this.name);
	}
}

public class Person {
	public static void main(String[] args) {
		TestSet4 t4 = new TestSet4("eeeee");
		System.out.println(t4);
	}
}
