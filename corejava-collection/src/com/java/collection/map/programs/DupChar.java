package com.java.collection.map.programs;

import java.util.Scanner;

public class DupChar {
public static void main(String[] args) {
	DupChar dc=new DupChar();
	String dupValue;
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter a string: ");
	dupValue =sc.nextLine();
	int count= duplicateNumChar(dupValue);	
	
	System.out.println(dc.duplicateNumChar("Saurah is doing somthimg today"));
	System.out.println("Number of duplicate character(s) are: "+count);
}

private static int duplicateNumChar(String dupValue) {
	int dupCount=0;
	for(int i = 0; i < dupValue.length(); i++) {
		int ch =dupValue.charAt(i);
		System.out.println("***"+dupValue.indexOf(ch));
		System.out.println("***"+dupValue.lastIndexOf(ch));
		if(dupValue.indexOf(ch)!=i&& dupValue.lastIndexOf(ch)==i){
			dupCount++;}
		//System.out.println(i);
	}
	return dupCount;
}

}
