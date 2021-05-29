package com.java.lara.polymorphism;

public class Prog33 {
	/*static Integer test(int i){
		System.out.println(i+"===");
		return i;}*/
	
	static int test(){
		Integer obj=new Integer(20);
		System.out.println(obj);
	return obj.intValue();
	}
public static void main(String[] args) {
	byte b1=20;
	//Integer obj=test(b1);
	//System.out.println(obj+"---");
	Integer o1=test();
	System.out.println(o1);
}
}
