package com.Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TT {
	public static void main(String[] args) {
		System.out.println("start");
			PrintWriter pr = null;
			try {
				pr = new PrintWriter("abc.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pr.println("hello");
			
		System.out.println("");
		
	}
}
