package com.scjpdumps.exception;

public class ExceptionClass1 {
	static float f;
	
	public static void parse(String str) {
		 try {
			  f = Float.parseFloat(str);
		 } catch (NumberFormatException nfe) {
		 f = 0;
	 } finally {
		 System.out.println(f);
		 }
		 }
		 public static void main(String[] args) {
			 
		 parse("invalid");
		 }
}
