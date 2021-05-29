package com.jlc.generic;

import java.util.*;

class Hello1 {
	void m1() {
		Collection<Integer> col1 = new ArrayList<Integer>();
		col1.add(123);
		col1.add(456);
		col1.add(new Integer(1212));
		show(col1);
	}

	void m2() {
		Collection<String> col2 = new ArrayList<String>();
		col2.add("abc");
		col2.add("xyz");
		col2.add("jlc1");
		show(col2);
	}

	void show(Collection<?> col1) {
		for (Object o : col1) {
			System.out.println(o);
		}
	}

	void Abc(Collection<String> col) {

	}
}

class Hai extends Hello1 {
	void show(Collection<?> col) {

	}

	void Abc(Collection<String> col1) {

	}

}

interface Animal {
	void eating();
}

class Dog implements Animal {
	public void eating() {
		System.out.println("Eating in dog");
	}
	/*
	 * public String toString(){ return "Dog"; }
	 */
}

class Cat implements Animal {
	public void eating() {
		System.out.println("Eating in cat");
	}
	/*
	 * public String toString(){ return "cat"; }
	 */
}

class AAA {
	void m11(Collection<? extends Animal> col1) {
		System.out.println("M11 in AAA");
	}

}

public class Test2 {

	public static void main(String[] args) {
		AAA a1 = new AAA();
		Collection<Dog> col1 = new ArrayList<Dog>();
		col1.add(new Dog());
		a1.m11(col1);
		Collection<Cat> col2 = new ArrayList<Cat>();
		col2.add(new Cat());
		a1.m11(col2);
	}
}
