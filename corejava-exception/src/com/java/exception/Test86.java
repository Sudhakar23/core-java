package com.java.exception;

public class Test86 {

	public static void main(String[] args) {
		try{
			int i1 = Integer.parseInt(args[0]);
			int i2 = Integer.parseInt(args[1]);
			int i3 = i1/i2;
			System.out.println(i3);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter the value " +e);
		}
//		System.out.println("sdafsd");
		catch(ArithmeticException e){
			System.out.println("Please do not provide zero " +e);
		}
		catch(NumberFormatException e){
			System.out.println("Please provide Number " +e);
		}catch(Exception e){
			System.out.println("Boss of exception ");
		}
	}
}
