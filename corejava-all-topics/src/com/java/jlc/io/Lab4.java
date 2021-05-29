package com.java.jlc.io;

import java.io.*;

public class Lab4 {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter wr = null;
		FileReader fr = null;
		String fileName = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter source file name : ");
			fileName = br.readLine();
			fr = new FileReader(fileName);
			System.out.println("Enter dest file name : ");
			String destFileName = br.readLine();
			br = new BufferedReader(fr);
			wr = new BufferedWriter(new FileWriter(destFileName, true));
			while(true){
				String st = br.readLine();
				if(st == null)break;
				wr.write(st);
				wr.newLine();
			}
			wr.flush();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
