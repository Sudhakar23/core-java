package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int sid;
	String sname;
	Student(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
class MyCompare implements Comparator{

	public int compare(Object o1, Object o2) {
		Student a1 = (Student)o1 ;
		Student a2 = (Student)o2 ;
		
		return a1.sname.compareTo(a2.sname);
	}
	
}
class MyCompareSid implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
//		Student a1 = (Student)o1 ;
//		Student a2 = (Student)o2 ;
		
		return i1.compareTo(i2);
	}
	
}

public class B {

	public static void main(String[] args) {
		Student s1 = new Student(13,"RK");
		Student s2 = new Student(15,"SP");
		Student s3 = new Student(17,"SS");
		Student s4 = new Student(19,"PK");
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al, new MyCompareSid());
		for (Object object : al) {
			System.out.println(object);
		}
	}
}
