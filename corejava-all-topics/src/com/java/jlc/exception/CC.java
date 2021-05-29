package com.java.jlc.exception;

class SubException extends Exception { 
	
}
class SubSubException extends SubException {
	 
}
class MyException extends Exception{
	
}
 public class CC { void doStuff() throws SubException { } }

 class CC2 extends CC { void doStuff() throws SubSubException { } }

// class CC3 extends CC { void doStuff() throws Exception { } }

 class CC4 extends CC { void doStuff() throws SubSubException { } }

 class CC5 extends CC { void doStuff() { } }