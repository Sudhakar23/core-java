package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student   {
	int sid;
	String sname, email;

	Student(int sid, String sname, String email) {
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}

	public String toString(){
		return sid + " " + sname +" " +email;
	}
	public boolean equals(Object o){
		Student s = (Student)o;
		if(this.sid == s.sid)
			return true;
		return false;
	}

	
}
class SnameComparator implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.sname.compareTo(s2.sname);
		
	}	
}
class SidComparator implements Comparator{
	public int compare(Object o1, Object o2){
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		Integer i1 = s1.sid;
		Integer i2 = s1.sid;
		return i1.compareTo(i2);
		
	}	
}
class EmailComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.email.compareTo(s2.email);
	}
}
public class FieldComparatorsDemo {
	
	public static void main(String[] args) {
		List<Student> al = new ArrayList();
		Student s1 = new Student(22,"dd", "zz@jlc"); 
		Student s2 = new Student(44,"aa", "yy@jlc"); 
		Student s3 = new Student(11,"cc", "xx@jlc"); 
		Student s4 = new Student(33,"bb", "ww@jlc");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al, new SnameComparator());
		Iterator<Student> it = al.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s);
		}
		
	}
}
