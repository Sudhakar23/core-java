package com.jlc.io;
import java.io.Console;
import java.io.File;
import java.io.FileReader;

public class FileCharArray {

	public static void main(String[] args) throws Exception {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		char ch[] = new char[(int) file.length()];
		fr.read(ch);
		String str = new String(ch);
		System.out.println(str);
		System.out.println("Done");
		Console cs = System.console();

	}
}