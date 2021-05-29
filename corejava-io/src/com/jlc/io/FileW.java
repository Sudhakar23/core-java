package com.jlc.io;
import java.io.File;
import java.io.FileWriter;



public class FileW {

	public static void main(String[] args)throws Exception {
		File file= new File("abc.txt");
		FileWriter fw= new FileWriter(file);
		fw.write("A");
		fw.write("\n");
		fw.write("B");
		fw.write("\n");
		fw.write("C");
		fw.write("\n");
		fw.write("D");
		fw.write("\n");
		fw.flush();
		System.out.println("Done");
	}
}