package com.java.enm;
enum Days{mon, tue,wed,thu,fri,sat,sun}
enum Gender{mal,femal;
private int i;
	Gender(){}
	static void BIG(int c){}
	}
public class MyEnum {
	int a;
	Gender gn;
public static void main(String[] args) {

	MyEnum me=new MyEnum();
	me.a = 10;
	me.gn=Gender.femal;
	Gender.BIG(5);
}
}
