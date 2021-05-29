package com.java.jlc.exception;
public class Test1 {
	public static void main(String[] args) {
		{
			System.out.println(decision());
		}
	}
	static boolean decision(){
		try{
			return true;
		}
		finally{
			return false;
		}
//		return true;//finally{return false;}
	}
}
