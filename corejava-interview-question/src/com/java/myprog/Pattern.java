package com.java.myprog;

public class Pattern 
{
    public static void main(String[] args) {
	for (int i = 1; i <5; i++) {
		
		for (int j = 1; j <5; ++j) {
			
			//System.out.print(j+" ");
			/*if (i+j<=4) {
				System.out.print("  ");
			}if (i+j>=5) {
				System.out.print(j+" ");
			}*/
			if (i>=j) {
				System.out.print(i+"  ");
			}
		}
		System.out.println();
	}
}
}
