package com.java.corejava;



public class Ques01 {
	public static void main(String[] args) {
		new Ques01();
	}
	
	
	//Instance variale and instance block gets executed in their order they appear.
	{
		System.out.println(this.ab);
	}

	{
		System.out.println(this.ab);
	}
	int ab = 10;
}

