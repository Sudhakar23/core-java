package com.java.myprog;

public class Palindrom {
	   public static void main(String args[])
	   {
		   int i=121,b,c=i,d=0;
	       for (int j = i; j > 0; j=i) {
			b=i%10;
			i=i/10;
			d=d*10+b;
			
		}
	       System.out.println(d);
	       if (c==d) {
			System.out.println("no is palindrom "+d);
		}else{
			System.out.println("no is nt palindrom  "+d);
		}
	   }
	}

