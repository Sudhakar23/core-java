package com.java.collection.lara;

import java.util.Arrays;

class B1 implements Comparable{
	int i;
	B1(int i){
		this.i=i;
	}
	public String toString(){
		return "i= " +i;
	}
	@Override
	public int compareTo(Object o) {
		
		return ((B1)o).i-i;
	}
}
public class Prohram29 {
public static void main(String[] args) {
	//int y[]={40,20,60,30};
	//B1[] x=new B1[2];
	B1[] x=new B1[5];
	x[0]=new B1(9);
	x[1]=new B1(7);
	x[2]=new B1(6);
	x[3]=new B1(4);
	x[4]=new B1(2);
	/*x[0]=new B1(90);
	x[1]=new B1(70);
	B1[]y={new B1(9), new B1(80)};*/
	System.out.println(Arrays.toString(x));
	//System.out.println(Arrays.toString(y));
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	
}
}
