package com.khalid.ExceptionHandlingQues;

public class Exception1 {
public static void main(String[] args) {
	/*RuntimeException re=null;
	throw re;*/
	try {
		if (args.length==1) {
			System.out.println(args[0]);
		}
	} finally{
		System.out.println("The End");
	}
}
}
