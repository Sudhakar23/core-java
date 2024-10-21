package com.java.collections.scjp;

import java.util.Collections;
import java.util.TreeSet;
/*class Dog{
	int size;
	Dog(int s){size=s;}
}*/
class Dog implements Comparable<Dog>{
	
	Integer size;
	@Override
	public int compareTo(Dog o) {
		
		return size.compareTo(o.size);
	}
	Dog(Integer s){
		size=s;
	}
}

public class Selftest15 {
public static void main(String[] args) {
	TreeSet<Integer> i=new TreeSet<Integer>();
	TreeSet<Dog> d=new TreeSet<Dog>();
	d.add(new Dog(4));
	d.add(new Dog(2));
	d.add(new Dog(3));
	i.add(4);
	i.add(2);
	i.add(3);
	System.out.println(d.size()+ "  "+i.size());
	//Collections.sort(d);
	
}
}
