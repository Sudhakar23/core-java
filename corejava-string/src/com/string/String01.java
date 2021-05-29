package com.string;

public class String01 {

	public static void main(String[] args) {
		String rupsi = " Hello World ";

		for (String part : rupsi.split(" ")) {
		    System.out.print(new StringBuffer(part).reverse().toString());
		    System.out.print(" ");
		}
	}
}