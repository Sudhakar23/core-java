package com.java.collection;
class StudentTest{
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
		StudentTest st=(StudentTest)obj;
		return  (name.equals(st.name))&&(fname.equals(st.fname))&&(lname.equals(st.lname));
	}
	@Override
	public int hashCode() {
		
		return name.hashCode()+fname.hashCode()+lname.hashCode();
	}
	
}

public class Test {

	public static void main(String[] args) {
		StudentTest st=new StudentTest();
		st.setName("anan");
		st.setFname("kishor");
		st.setLname("java");
		StudentTest st1=new StudentTest();
		st1.setName("anan");
		st1.setFname("kishor");
		st1.setLname("java");
		System.out.println(st.equals(st1));
		System.out.println(st.hashCode()==st1.hashCode());
		
		
		
		
		

	}

}
