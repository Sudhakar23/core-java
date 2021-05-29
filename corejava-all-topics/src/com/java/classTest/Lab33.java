package com.java.classTest;

public class Lab33 {
	static{
		
		System.out.println("static ");
		new Lab33();
	}
	{	
		new Lab33();
		System.out.println("Instance ");
	}
	public Lab33(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		
	}
}
