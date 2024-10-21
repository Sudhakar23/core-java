package com.java.collection;

import java.util.Scanner;

public class ReverseWord {	
	public static void main(String[] args) {

		
		System.out.println("enter your text:-");
		Scanner sc=new Scanner(System.in);
		char ch;
		for(;;)
		{
			String s1=sc.next();
			int l=s1.length();
			System.out.println(l);
			char c=0;
			for(int i=0;i<l;i++){
				c=s1.charAt(i);
				System.out.println(c);
			
				
			}
			System.out.println();
			int j=s1.length()-1;
			for(int x=j;x>=0;x--){
				ch=s1.charAt(x);
				System.out.println(ch);
			}
			
			
		 
			
		}
		

	}

}
