package com.java.jlc.oldcore;
class Hello36{
  int a, b ;
  static int c = 30;
  {
    System.out.println("IB in Hello");
  }
  static{
    System.out.println("SB in Hello");
  }
 
  /*Hello(){
   System.out.println("---Default Constructor---");
  }*/
  Hello36(int a){
   System.out.println("Parameterized Constructor 1 para");
   a = a;
  }
  Hello36(int a, int b){
   System.out.println("Parameterized Constructor 2 Para");
   this.a = a; this.b = b; 
   //a = a; b = b; 
  }
 void show(){
  System.out.println("Show in Hello");
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
 }  
}
class Test36{
  public static void main(String args[]){
   //Hello h = new Hello();
   //Hello h1 = new Hello(123);
   Hello36 h2 = new Hello36(12,32);
   //h.show();
   //h1.show();
   h2.show();
   //h.Hello();
   //h1.Hello();   
   }
}