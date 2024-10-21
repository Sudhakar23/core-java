package com.jlc.serialDeserial;

import java.io.*;

class Person{
	String sname;
	int contact;
	public Person(){}
	public Person(String sname, int conct){
		this.sname = sname;
		this.contact = contact;
	}
}

class User extends Person implements Serializable{
	String uid;
	//String name;
	//int contact;
	String email;
	public User(){
		
	}
	public User(String sname, int conct, String uid, String email) {
		super(sname, conct);
		this.uid = uid;
		this.email = email;
	}
}

class Student extends User{
	String Address;
	transient String password;
	static double fee = 102.999;
	public Student(){}
	
	public Student(String sname, int conct, String uid, String email,
			String address, String password, double fee) {
		super(sname, conct, uid, email);
		this.Address = address;
		this.password = password;
		this.fee = fee;
	}
}

public class Serialization implements Serializable {
	public static void main(String[] args) throws IOException {
		Student st = new Student("101",1234,"som","s@ymail","blore","gjgjg",1002.2);
		//System.out.println(st);
		Student.fee = 222.222;
		System.out.println(st);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("info.txt"));
		oos.writeObject(st);
	}
}