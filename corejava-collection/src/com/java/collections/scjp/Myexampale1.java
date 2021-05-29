package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student3 {
	String name;
	String rollno;
	String email;
	String address;
	String phone;

	Student3(String n, String r, String e, String a, String p) {
		name = n;
		rollno = r;
		email = e;
		address = a;
		phone = p;
	}
	public String toString(){
		return name +" "+ rollno +" "+ email +" " + address +" " +phone +" \n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
class NameSort implements Comparator<Student3>{
	@Override
	public int compare(Student3 o1, Student3 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class AddressSort implements Comparator<Student3>{
	@Override
	public int compare(Student3 o1, Student3 o2) {
		// TODO Auto-generated method stub
		return o1.getAddress().compareTo(o2.getAddress());
	}
}
public class Myexampale1 {
public static void main(String[] args) {
	Student3 stu=new Student3("abc","HS-30-16","abc@gmail", "blor","44444");
	Student3 stu1=new Student3("xyz","HS-35-5","xyz@gmail", "chen","55555");
	Student3 stu2=new Student3("pqr","HS-51-32","pqr@gmail", "dli","66666");
	ArrayList<Student3> ar=new ArrayList<Student3>();
	ar.add(stu);
	ar.add(stu1);
	ar.add(stu2);
	
	Collections.sort(ar, new NameSort());
	System.out.println(ar);
	Collections.sort(ar, new AddressSort());
	System.out.println(ar);
}
}
