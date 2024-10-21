package com.java.lara.polymorphism;

public class Prog3 {
	//Program 27.
	static void test(int i){System.out.println("done");}
public static void main(String[] args) {
	Integer obj3=new Integer(10);
	System.out.println(obj3);
	test(11);
	test(obj3.intValue());
	int h=obj3.intValue();
	
	double d1=45.987;
	String s1="67.9898";
	Double d2=Double.valueOf(d1);
	Double d3=Double.valueOf(s1);
	Double d4=d3.doubleValue();
	Double d5=d3.doubleValue();
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	System.out.println(d5);
	
	//Using Boolean.
	boolean b1=false;
	String s2="true";
	String s3="sudhakar";
	Boolean b2=Boolean.valueOf(b1);
	Boolean b3=Boolean.valueOf(s2);
	Boolean b4=Boolean.valueOf(s3);
	System.out.println(b4);
	Boolean b5=b2.booleanValue();
	Boolean b6=b3.booleanValue();
	Boolean b7=b4.booleanValue();
	System.out.println(b5);
	System.out.println(b6);
	System.out.println(b7);
	
	//Using String and Double.
	String s4="908";
	Double d6=Double.valueOf(s4);
	System.out.println(d6);
	
	//String and character.
	String s5="s";
	char c1='d';
	Character c2;
	
	//integer and String.
	int i=10;
	String s6=Integer.toString(i);
	double j=30.09;
	String s7=Double.toString(j);
	boolean k=true;
	String s8=Boolean.toString(k);
	char c='f';
	String s9=Character.toString(c);
	System.out.println("-------");
	System.out.println(s6);
	System.out.println(j);
	System.out.println(s7);
	System.out.println(k);
	System.out.println(s8);
	System.out.println(c);
	System.out.println(s9);
	
	//using String and Byte.
	String s10="45";
	byte b=Byte.parseByte(s10);
	int i1=Integer.parseInt(s10);
	double d=Double.parseDouble(s10);
	long l=Long.parseLong(s10);
	System.out.println("======");
	System.out.println(s10);
	System.out.println(b);
	System.out.println(i1);
	System.out.println(d);
	System.out.println(l);
	
	//using String and float.
	String s11="98";
	float f1=Float.parseFloat(s11);
	System.out.println(f1);
	
	//using String and boolean.
	String s12="abc";
	String s13="true";
	boolean b8=Boolean.parseBoolean(s12);
	boolean b9=Boolean.parseBoolean(s13);
	System.out.println(b8);
	System.out.println(b9);
	int i2=10;
	double j1=i2;
	System.out.println(j1);
	
	//Program 22.
	Integer obj1=new Integer(10);
	Integer obj2=10;
	System.out.println(obj1);
	System.out.println(obj2);
	
	//Program 23.
	int i3=10;
	new Integer(11).intValue();
	System.out.println("====");
	//System.out.println(j2);
	
	//Program 24.
	char c3=new Character('s');
	char c4='s';
	System.out.println(c3);
	System.out.println(c4);
	
	//Program 25.
	Double d7=new Double(20);
	double d8=d7.doubleValue();
	System.out.println(d7);
	System.out.println(d8);
	
	//Program 26
	int i4=10;
	Integer j5=new Integer(11);
	int k1=j5.intValue();
	Integer m=j5;
	System.out.println(k1);
	System.out.println(m);
	
	//Program 27.
	Double d9=new Double(20);
	double d10=30;
	System.out.println(d10+"===");
	test(d9);
	System.out.println(d9+"===");
	test(new Double(d10));
}
static void test(Double obj4){System.out.println("----");}
}
