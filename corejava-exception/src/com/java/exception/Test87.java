package com.java.exception;

public class Test87 {

	public static void main(String[] args) {
		try{
			int i1 = Integer.parseInt(args[0]);
			int i2 = Integer.parseInt(args[1]);
			int i3 = i1/i2;
			System.out.println(i3);
		}catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Java 7 support multiple exception ");
				if(e instanceof NumberFormatException)
			System.out.println("Please provide Number" +e);
				else if(e instanceof ArithmeticException) 
			System.out.println("Please provide non zero Number" +e);
				else if(e instanceof ArrayIndexOutOfBoundsException)
			System.out.println("Please provide values " +e);

		}		

	}

}
