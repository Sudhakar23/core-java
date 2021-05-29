package com.java.polymorphism;
class K{
	int i;
	K(int i){this.i=i;}
	public String toString(){
		String s1=super.toString();
		System.out.println(s1);
		String s2="i= "+i;
		return s1+" & "+s2;
	}
}
public class Prog9 {
public static void main(String[] args) {
	K k1=new K(10);
	K k2=new K(20);
	System.out.println(k1);
	System.out.println(k2);
}
}
