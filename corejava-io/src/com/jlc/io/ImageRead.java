package com.jlc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ImageRead {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
	//String url = "C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/sunset.jpg";
	String url1 = "C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/sunset1.jpg";
	String url = "D:\\log.txt";
	
	File file = new File(url);
	File file1 = new File(url1);
	FileInputStream fis= new FileInputStream(file);
	BufferedInputStream bis= new BufferedInputStream(fis);
	byte image[]= new byte[(int)file.length()];
	FileOutputStream fos= new FileOutputStream(file1);
	BufferedOutputStream out= new BufferedOutputStream(fos);
	bis.read(image);
	out.write(image);
	out.flush();
	out.close();
	bis.close();
	fos.close();
	try {
		String str= null;
		if(str.equals("Manish")){
			System.out.println("Hi");
		}
		
	} catch (Exception e) {
		PrintStream ps= new PrintStream(file);
		System.setOut(ps);
		System.out.println(e.getMessage());
	}	
		
		/*	try {
			InputStream is = new BufferedInputStream(System.in);
			Pri nnt
			PrintStream ps = System.out;
			char ch = 'a';
			do{
				int i = is.read();
				ch = (char)i;
				ps.write(ch);
			}while(ch =='\n');
		} catch (Exception e) {
			System.out.println(e);
		}*/
	}
}
