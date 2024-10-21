package com.java.collection.lara;

public class Problem37 {
public static void main(String[] args) {
	int x[][]=new int[3][2];
	x[0][0]=10;
	x[0][1]=10;
	x[1][0]=10;
	x[1][1]=10;
	x[2][0]=10;
	x[2][1]=10;
	for (int i = 0; i < x.length; i++) {
		for (int j = 0; j < x[i].length; j++) {
			
			System.out.println(x[i][j]);
		}
	}
}
}
