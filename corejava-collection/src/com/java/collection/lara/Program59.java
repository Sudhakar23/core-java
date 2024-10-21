package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A2{
	int i;
	A2(int i){
		this.i=i;
	}
	public String toString(){
		return "i="+i;
	}
}
public class Program59 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("abc");
	a.add(90);
	a.add(new A2(100));
	a.add(new A2(200));
	System.out.println(a);
	//Collections.sort(a);
	//System.out.println(a);
	/*a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	a.add(8);
	System.out.println(a);
	Comparator ctr=Collections.reverseOrder();
	Collections.sort(a,ctr);
	System.out.println(a);
	int result=Collections.binarySearch(a, 3, ctr);
	System.out.println(result);*/
}
}
