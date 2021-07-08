package com.jlc.io;

import java.io.*;

public class Lab3 {
	public static void main(String[] args) {
		BufferedReader br ;
		FileInputStream fin ;
		String fileName = null ;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter source file name :");
			fileName = br.readLine();
			fin = new FileInputStream(fileName);
			System.out.println("Enter Dest file name :");
			String destFileName = br.readLine();
			FileOutputStream fout = new FileOutputStream(destFileName, true);
			while(true){
				int ab = fin.read();
				if(ab == -1) break;
				System.out.println(ab);
				fout.write(ab);
			}
			System.out.println("Write Completed");
		}catch(FileNotFoundException e){
			System.out.println(fileName +" not found");
		}catch(Exception e){
			System.out.println(fileName +" not found");
		}
	}
}
