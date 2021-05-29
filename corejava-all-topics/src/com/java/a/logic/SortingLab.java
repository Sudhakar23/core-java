package com.java.a.logic;

import java.util.*;

class Student11 implements Comparable<Student11> {
	String name;
	public Student11(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student11 obj) {
		return this.name.compareTo(obj.name);
	}

	@Override
	public String toString() {
		return "name:" + name + "\n";
	}
}

public class SortingLab {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		Student11 st = new Student11("kishor");
		Student11 st1 = new Student11("anand");
		Student11 st2 = new Student11("hiiii");
		Student11 st3 = new Student11("hhhkishor");

		al.add(st);
		al.add(st1);
		al.add(st2);
		al.add(st3);
		// System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
