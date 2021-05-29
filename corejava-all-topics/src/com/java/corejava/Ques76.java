package com.java.corejava;

public class Ques76 {
	//static String s="Instance";
	public static void meyhod(StringBuffer sb){
		//s+="Add";
		sb.append("Added");
		sb=new StringBuffer("Hai");
	}
//	public static void method(float f){System.out.println("flost");}
//	public static void method(double f){System.out.println("double");}
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	//method(sb);
	//Ques76 q=new Ques76();
/*s="new Instance";
	String s="Local";*/
	//method(s);
	System.out.println(sb);
	//System.out.println(q.s);
	/*Integer i1=new Integer(127);
	Integer i2=new Integer(127);
	Long l=new Long(127);
	System.out.println(i1.hashCode());
	System.out.println(i2.hashCode());
	System.out.println(i1==i2);
	System.out.println(i1.equals(i2));
	System.out.println(i1.equals(l));*/
	/*float f1=2.0f;
	float f2=2.0f;
	method(1.0);
	method(1.0f);
	method(1.0f*2.0f);
	method(1.0f*2.0);
	method(f1*f2);*/
}
}
