package com.java.jlc.oldcore;
class Hello34{
  void m1(){
  System.out.println("M1 in Hello");
  }
}
class Hai34{
  void m11(){
   System.out.println("M11 in Hello");
  }
  int m22(){
   System.out.println("M22 in Hai");
   return 111; 
  }
  byte m33(){
   System.out.println("M33 in Hello");
   return (12+23);
  }
  Hello34 m44(){
   System.out.println("M44 in Hai");
   return new Hello34();
  }
}

class Test34{
   public static void main(String args[]){
    Hello34 h = new Hello34();
    Hai34 hai = new Hai34();
     //hai.m11();
     //int i1 = hai.m22(); 
     //System.out.println(hai.m22());// +"....");
     //System.out.println(hai.m33()); 
     Hello34 h11 = hai.m44(); 
     System.out.println(h11 +"=====\n");
     h.m1();
 }
}