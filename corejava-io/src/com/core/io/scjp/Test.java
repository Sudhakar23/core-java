package com.core.io.scjp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		File file = new File("fileWrite2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String dat = br.readLine();
		System.out.println(dat);
	}
}