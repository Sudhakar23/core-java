package com.java.myprog;

public class SellCost {
	
public static void main(String[] args) {
	int cs=150;
	int sl=120;
	if (sl>cs) {
		int a=sl-cs;
		
		System.out.println(a+"  get profit");
	}else {
		int b=cs-sl;
		int c=(sl*100)/cs;
		System.out.println(c+"  get loss");
	}
}
}
