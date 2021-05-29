
package com.Rstring;

public class StrRevTest1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sudhakar");
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3=sb;
//		System.out.println(sbsb2);
		//System.out.println(sb2.reverse());
		sb2=sb.reverse();
		if(sb3.equals(sb2)){
			System.out.println(sb);
			System.out.println("Pallendrom");
		}
		else 
			System.out.println("Not Pallendrom");
	}
}
