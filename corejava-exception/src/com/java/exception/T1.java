package com.java.exception;

public class T1 {
	public static void main(String[] args) {
		badMethod();
	}
	static void badMethod(){
		doStuff();
	}
	static void doStuff(){
		try{
			throw new Error();
//			System.out.println("dostuff");
		}catch(Error me){
			
			System.out.println("dostuff catch block...");
			throw me;
		}
	}
}
