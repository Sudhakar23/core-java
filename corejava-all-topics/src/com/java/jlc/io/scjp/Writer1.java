package com.java.jlc.io.scjp;

import java.io.*;

public class Writer1 {
	public static void main(String[] args) throws IOException {
		File file = new File("fileWrite.txt");
		
//		System.out.println(file.exists());
//		System.out.println(file);
		
//		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists());
		 
		System.out.println("Done");

	}

	
}
