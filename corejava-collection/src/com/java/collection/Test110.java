package com.java.collection;
import java.util.*;
class Hello{
	void m1(){
		System.out.println("Hello in M1");
	}
}

public class Test110 {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
	/*	a1.add(111);
		a1.add(new Integer(99));
		a1.add(new Double(123.01));
		a1.add(new String("JLC"));
		a1.add("jlc1");*/
		a1.add(111);
		a1.add(new Hello().hashCode());
		
		//System.out.println(a1);
		/*for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}*/
		ArrayList al1 = new ArrayList();
		al1.add("abc");
		al1.add(new Integer(122));
		al1.add(a1);
		System.out.println("Inside al1************");
		System.out.println(al1);
		
	//	System.out.println("Using iterator");
		Iterator it = al1.iterator();
	//	System.out.println(it);
	//	System.out.println(it.hasNext());
		
		System.out.println("***List Iterator***");
		ListIterator li = al1.listIterator();
		
		//System.out.println("**Previous**");
		
		while(li.hasNext()){
			System.out.println(li.next());
		}
		//System.out.println(li.next());
		System.out.println("**Previous**");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		System.out.println(" ### Test Method ### ");
		System.out.println("al1 -> "+al1);
		//al1.clear();
		a1.retainAll(al1);
		System.out.println(" ### After Retain ### ");
		System.out.println("al1 -> "+al1);
		//al1.clear();
		//System.out.println(al1);
		
	}
}