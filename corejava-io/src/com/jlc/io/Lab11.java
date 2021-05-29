package com.jlc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Lab11 {

	public static void main(String[] args) throws Exception{
			try {
			InputStream is = new BufferedInputStream(System.in);
	
			PrintStream ps = System.out;
			char ch = 'a';
			do{
				int i = is.read();
				ch = (char)i;
				ps.write(ch);
			}while(ch =='\n');
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
