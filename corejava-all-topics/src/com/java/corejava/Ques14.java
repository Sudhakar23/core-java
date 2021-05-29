package com.java.corejava;

public class Ques14 {
public static void main(String[] args) {
	int val=12;
	if (val++ == 10) {
		System.out.println("ten");
	}else if(val++ == 12){
		System.out.println("Twelve");
	}else if(++val== 19){
		System.out.println("nineteen");
	}else{
		System.out.println("else block");
	}
	System.out.println(val);
}
}
