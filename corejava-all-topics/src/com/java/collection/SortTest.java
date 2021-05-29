package com.java.collection;

import java.util.*;

class Student1 {
	int sid;
	String sname;
	Student1(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return sid +" " +sname ; 
	}
	
}
class SortSid implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1)o1;
		Student1 s2 = (Student1)o2;
		return s1.sname.compareTo(s2.sname);
	}
}

public class SortTest {
	public static void main(String[] args) {
		Student1 s1 = new Student1(11,"Pranay");
		Student1 s2 = new Student1(12,"Nitish");
		Student1 s3 = new Student1(13,"Amit");
		Student1 s4 = new Student1(14,"Ravi");
		List lt = new ArrayList();
		lt.add(s1);
		lt.add(s2);
		lt.add(s3);
		lt.add(s4);
		Collections.sort(lt, new SortSid());
		Iterator it =  lt.iterator();
		while(it.hasNext()){
			it.next();
			System.out.println(it.next());
		}
	}
}