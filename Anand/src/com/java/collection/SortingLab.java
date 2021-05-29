package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
	}

	

	@Override
	public int compareTo(Student obj) {
		
		return this.name.compareTo(obj.name);
	}
	@Override
	public String toString() {
		
		return "name:\t"+name;
	}
	
}

public class SortingLab {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();

		Student st=new Student("kishor");
		Student st1=new Student("anand");
		Student st2=new Student("hiiii");
		Student st3=new Student("hhhkishor");
		
		al.add(st);
		al.add(st1);
		al.add(st2);
		al.add(st3);
		//System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		

	}

}
