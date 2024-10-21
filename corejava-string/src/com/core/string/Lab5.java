package com.core.string;

public class Lab5 {
	public static void main(String[] args) {
		Address add = new Address(101, "HMT main rd", "Blore", 32323);
		Student stud = new Student(99, "Srinivas", 98766, add);
		System.out.println(stud);
		System.out.println("-Modifying the add ref in Main-");
		add.aid = 1212;
		add.street = "Madiwala";
		System.out.println(stud);
		System.out.println(stud.getSid());
		Address ref = stud.getStudAddress();
		ref.aid = 1111;
		System.out.println(stud);
	}
}

final class Address {
	int aid;
	String street, city;
	int pin;

	public Address(int aid, String street, String city, int pin) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public Object close() {
		return new Address(this.aid = aid, this.street = street,
				this.city = city, this.pin = pin);
	}

	public String toString() {
		return aid + street + city + pin;
	}
}

final class Student {
	private final int sid;
	private final String name;
	private final long phone;
	private final Address studAdd;

	public Student(int sid, String name, long phone, Address studAdd) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.studAdd = new Address(studAdd.aid, studAdd.street, studAdd.city,
				studAdd.pin);
	}

	public String toString() {
		return "Stud Info\t:" + sid;
	}

	public int getSid() {
		return this.sid;
	}

	public Address getStudAddress() {
		return (Address) studAdd.close();
	}
}
