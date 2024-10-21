package com.java.jlc.oldcore;
class Hello35{
 int a, b ;
 static int c = 30;
 {
   System.out.println("Inst blk");
 }
 static{
   System.out.println("Static block");
 }
 int Hello35(){
   System.out.println("--------Default Constructor----------");
   return 0;
 }
  Hello35(int a1){
   System.out.println("Parameterized Constructor");
   a = a1;
 }
 Hello35(int a1, int b1){
 System.out.println("2 Para");
 this.a = a1; this.b = b1;
 }
 void show(){
  System.out.println("Show in Hello");
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
 }
}

class Test35{
   public static void main(String args[]){
   //Hello h = new Hello();
   Hello35 h1 = new Hello35(123,123);
   //h.show();
   h1.Hello35();
 }
}