package com.java.logic;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		System.out.println("Enter your text:");
		Scanner sc=new Scanner(System.in);
		String strobj=sc.nextLine();
		int strlen=strobj.length();
		System.out.println(strlen);
		char c=0;
		/*for(int i=0;i<strlen; i++){
			c=strobj.charAt(i);
			
		}*/
	
		for(int i=strlen-1;i>=0;i--){
			c=strobj.charAt(i);
			System.out.print(c);
		}

	}

}