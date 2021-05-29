package com.java.jlc.oldcore;

class Hello101{

public static void main(String args[]){

  int minutes = 0;
 
  for(int ms = 0; ms <  360000; ms++) 
    if(ms % 60 * 10000 == 0)
    minutes++;
   System.out.println(minutes);

  }
}