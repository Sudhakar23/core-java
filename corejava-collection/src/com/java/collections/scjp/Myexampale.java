package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	String rollno;
	String email;
	String address;
	String phone;

	Student(String n, String r, String e, String a, String p) {
		name = n;
		rollno = r;
		email = e;
		address = a;
		phone = p;
	}
	public String toString(){
		return name +" "+ rollno +" "+ email +" " + address +" " +phone +" \n";
	}
	@Override
	public int compareTo(Student o) {
		
		return address.compareTo(o.address);
	}
}

public class Myexampale {
public static void main(String[] args) {
	Student stu=new Student("abc","HS-30-16","abc@gmail", "blor","44444");
	Student stu1=new Student("xyz","HS-35-5","xyz@gmail", "chen","55555");
	Student stu2=new Student("pqr","HS-51-32","pqr@gmail", "dli","66666");
	ArrayList<Student> ar=new ArrayList<Student>();
	ar.add(stu);
	ar.add(stu1);
	ar.add(stu2);
	Collections.sort(ar);
	System.out.println(ar);
}
}
