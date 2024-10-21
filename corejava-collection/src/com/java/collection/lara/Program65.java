package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
class D implements Comparable{
	int i,j;
	D(int i,int j){
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+i+","+j+")";
	}
	@Override
	public int compareTo(Object o) {
		
		return i-((D)o).i;
	}
}
public class Program65 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new D(9,4));
	al.add(new D(4,3));
	al.add(new D(5,6));
	al.add(new D(7,2));
	al.add(new D(2,6));
	al.add(new D(8,1));
	al.add(new D(5,7));
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
