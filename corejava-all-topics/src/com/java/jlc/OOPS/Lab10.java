package com.java.jlc.OOPS;

public class Lab10 {
	
	public static void main(String[] args){
		System.out.println("Main in lab10");
		System.out.println(Mno.VAL);
	}
}
class Mno{
	static{
		System.out.println("This is SB");
	}
	final static int VAL = 9090;
	static int VAL1 = 9090;
	static{
		System.out.println("SB in Mno " +VAL);
		System.out.println("SB in Mno " +VAL1);
	}	
}
