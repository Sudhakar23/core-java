package com.java.logic;
class Stud {
	private String name;
	private String fname;
	private String lname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public boolean equals(Object obj) {
		Stud st = (Stud) obj;
		return (name.equals(st.name)) && (fname.equals(st.fname)) && (lname.equals(st.lname));
	}
	@Override
	public int hashCode() {
		return name.hashCode() + fname.hashCode() + lname.hashCode();
	}
}

public class TestHashCode {
	public static void main(String[] args) {
		Stud st = new Stud();
		st.setName("anan");
		st.setFname("kishor");
		st.setLname("java");
		Stud st1 = new Stud();
		st1.setName("anan");
		st1.setFname("kishor");
		st1.setLname("java");
		System.out.println(st.equals(st1));
		System.out.println(st.hashCode() == st1.hashCode());
		System.out.println(st.hashCode() + st1.hashCode());
	}
}
