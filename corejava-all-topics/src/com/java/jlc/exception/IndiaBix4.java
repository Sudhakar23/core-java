package com.java.jlc.exception;

import java.io.*;

public class IndiaBix4 {

	void m1() {
		System.out.print("Start ");
		try {
			System.out.print("Hello world");
			throw new FileNotFoundException();
		}
		catch (Exception e) {
			System.out.print("End of file exception");
		}
		
	
}
}