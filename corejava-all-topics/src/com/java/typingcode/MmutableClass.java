package com.java.typingcode;

public final class MmutableClass {
private int i;
MmutableClass(int i){
	this.i=i;
	}
public MmutableClass m1(int i){
	return new MmutableClass(i);
	
}
public static void main(String[] args) {
	MmutableClass mc=new MmutableClass(10);
	MmutableClass mc1=mc.m1(100);
	MmutableClass mc2=mc.m1(10);
	System.out.println(mc==mc2);
	System.out.println(mc1==mc2);
}
}
