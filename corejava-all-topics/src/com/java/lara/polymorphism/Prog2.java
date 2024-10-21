package com.java.lara.polymorphism;

public class Prog2 {
public static void main(String[] args) {
	/*int i=4;
	Integer obj=new Integer(i);
	int k=obj.intValue();
	System.out.println("done");
	System.out.println(k);*/
	
	//Using Double.
	Double d1=new Double(10.09);
	Double d2=d1.doubleValue();
	System.out.println(d2);
	System.out.println(d1);
	
	//Using char.
	char c1='a';
	Character c2=new Character(c1);
	Character c3=c2.charValue();
	System.out.println("done3");
	System.out.println(c2);
	System.out.println(c3);
	
	//Using boolean.
	boolean b1=false;
	Boolean b2=new Boolean(b1);
	Boolean b3=new Boolean(true);
	Boolean b4=b3.booleanValue();
	Boolean b5=b4.booleanValue();
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);
	
	//Using String to Integer.
	String s1="10";
	Integer obj=new Integer(s1);
	int i=obj.intValue();
	System.out.println("Integer");
	System.out.println(obj);
	System.out.println(i);
	
	//Using String to double.
	String s2="9.989";
	Double d3=new Double(s2);
	Double d4=d3.doubleValue();
	System.out.println(d3);
	System.out.println(d4);
	
	//Using Byte.
	String s3="10z";
	Byte b6=new Byte(s3);
	Byte b7=b6.byteValue();
	System.out.println(b6);
	System.out.println(b7);
	
	//Using String to boolean.
	String s4="true";
	String s5="false";
	String s6="abc";
	Boolean b8=new Boolean(s1);
	Boolean b9=new Boolean(s2);
	Boolean b10=new Boolean(s3);
	Boolean b11=b8.booleanValue();
	Boolean b12=b9.booleanValue();
	Boolean b13=b10.booleanValue();
	System.out.println(b8);
	System.out.println(b9);
	System.out.println(b10);
	System.out.println(b11);
	System.out.println(b12);
	System.out.println(b13);
	
	//Using String to integer.
	int i1=10;
	String s7="20";
	Integer obj1=new Integer(i1);
	Integer obj2=new Integer(s7);
	int m=obj1.intValue();
	int n=obj2.intValue();
	System.out.println(m);
	System.out.println(n);
}
}
