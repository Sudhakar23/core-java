package com.core.io.dande;

import java.io.DataInputStream;

public class Lab1 {
	public static void main(String[] args) {
		try{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter first no :");
			int a = Integer.parseInt(dis.readLine());
			System.out.print("Enter second no :");
			int b = Integer.parseInt(dis.readLine());
			int sum = a + b;
			System.out.println("Sum is " +sum);
		}catch(Exception e){
			System.out.println("Exception");
		}
	}
}
