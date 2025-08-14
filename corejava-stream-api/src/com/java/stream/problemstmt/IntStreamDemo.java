package com.java.stream.problemstmt;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		IntStreamDemo as = new IntStreamDemo();
		System.out.println(as.fTest());
		
	}
	public String fTest() {
		try {
			System.out.println("TRY");
			int a = 1/0;
			return "try";
		}
		finally	{
			System.out.println("FINALLY");
			try {
				int a = 1/0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
			return "finally";
		}
//		System.out.println("end");
//		return "end";
	}
}
