package com.java.tst;

public class FinallyTest {
	public static void main(String[] args) {
		System.out.println(test() );
	}
	public static int test(){
		try {
			
			System.out.println("P");
			System.out.println("Q");

		}catch(Exception e){
			System.out.println("Inside code");
		}
		finally{

			System.out.println("R");
			System.exit(1);
			System.out.println("S");
		}
		return 10;
	}
}
