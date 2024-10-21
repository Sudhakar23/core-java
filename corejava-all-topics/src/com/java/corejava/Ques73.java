package com.java.corejava;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ques73 {
public static void main(String[] args) {
	Map s=new Hashtable();
	//s.put(3, null);
	s.put("1", "one");
	s.put("3", "three");
	s.put("2", "two");
	System.out.println(s);
	/*Set s=new TreeSet();
	s.add(new Person(20));
	s.add(new Person(10));
	s.add(new Person(23));
	System.out.println(s);*/
}
}
/*class Person{
	Person(int i){}
}*/
