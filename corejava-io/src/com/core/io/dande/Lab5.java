// Example to read data from keyboard and write to file.
package com.core.io.dande;

import java.io.*;

public class Lab5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter wr = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
//			wr = new BufferedWriter(new FileWriter("studinfo.txt",true ));
			System.out.println("Enter Id : ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Name : ");
			String name = br.readLine();
			
			System.out.println("Enter Phone : ");
			long phone = Long.parseLong(br.readLine());
			
			System.out.println("Enter Fee : ");
			float fee = Float.parseFloat(br.readLine());
			
			String info = id +" "+ name +" "+ phone +" "+ fee;
			
			wr = new BufferedWriter(new FileWriter("studinfo.txt",true ));
			
			wr.write(info);
			wr.newLine();
			wr.flush();
			System.out.println("writing completed");
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			
		}
	}
}
