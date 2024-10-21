package com.java.corejava;

public class Ques97 extends Thread {
	static String sName="Techno";
public static void main(String[] args) {
	Ques97 q=new Ques97();
	q.name(sName);
	System.out.println(sName);
	/*String str1="ABC";
	String str2="ABCX";
	System.out.println(str1.compareTo(str2));*/
	
}
public void name(String sName){
	sName=sName+"park";
	start();
}
public void run(){
	for (int i = 0; i <4; i++) {
	sName=sName+" "+i;	
	}
}
}
