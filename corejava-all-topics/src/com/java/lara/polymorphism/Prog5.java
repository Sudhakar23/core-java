package com.java.lara.polymorphism;

public class Prog5 {
	static void  test(Character c){System.out.println("Done");}
public static void main(String[] args) {
	System.out.println();
	test('a');
	System.out.println("====");
	char c1='t';
	test(c1);
	System.out.println(c1);
	Character c2='p';
	test(c2);
	System.out.println(c2);
	
	//Program 32.
	Boolean b1=new Boolean(true);
	if(b1)
	if(b1.booleanValue())
	{
		System.out.println(b1);
	}
	
}
}
