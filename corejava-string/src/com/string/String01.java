package com.string;

public class String01 {

	public static void main(String[] args) {
		String str = " Hello World ";

		for (String part : str.split(" ")) {
		    System.out.print(new StringBuffer(part).reverse().toString());
		    System.out.print(" ");
		}
	}
}