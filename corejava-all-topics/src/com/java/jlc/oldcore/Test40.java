package com.java.jlc.oldcore;
class Test40A{
  static {
	System.out.println("SB in Test40A");
   }
  public static void main(String args[]){
	  System.out.println("Main in Test40A");
	  
  }
}
class Test40B{	
  static{
    System.out.println("SB in Test40B");
   }
  public static void main(String args[]){
      System.out.println("Main in Test40B");
	  Test40A A = new Test40A();

  }
}