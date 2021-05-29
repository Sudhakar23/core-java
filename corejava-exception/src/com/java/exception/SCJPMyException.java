package com.java.exception;

class MyException extends RuntimeException{
	void someStuff(){
		
	
		doStuff();
	
	}
	void doStuff()throws MyException{
		
		try{
			throw new MyException();
		}catch(MyException me){
			throw me;
		}
	}
}

public class SCJPMyException {
	
}
