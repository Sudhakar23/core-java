package com.java.corejava;

public class Ques4 {
	static boolean foo(char c){
		System.out.println(c);
		return true;
	}
public static void main(String[] args) {
int i=0;
for (foo('A'); foo('B')&& (i<2) ; foo('C') ) {
	i++;
	foo('D');
	//System.out.println(i);
	
	//System.out.println("====");
}
}
}
