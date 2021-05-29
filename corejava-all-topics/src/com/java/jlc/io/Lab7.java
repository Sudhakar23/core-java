package com.java.jlc.io;

import java.io.File;
import java.io.IOException;

public class Lab7 {

	public static void main(String[] args)throws IOException {
		try{
			File f = new File("c:\\Hello.txt");
			f.createNewFile();
			File f2 = new File("hi.txt");
			f2.createNewFile();
			System.out.println("f2.isHidden()\t" +f2.isHidden());
			System.out.println("f2.delete()\t" +f2.delete());
			System.out.println("fileCreated");
			File f3 = new File("c:\\javaoutput\\IO");
			System.out.println("f3.isHidden()\t:"+f3.isHidden());
			File f4 = new File("JLC.txt");
			f4.createNewFile();
			System.out.println("After creating the file");
			System.out.println("f4.isHidden()\t:" +f4.isHidden());
			Runtime.getRuntime().exec("attrib +H JLC.txt");
			System.out.println(Runtime.getRuntime());
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
