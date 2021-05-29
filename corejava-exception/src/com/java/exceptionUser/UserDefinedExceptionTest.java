package com.java.exceptionUser;

class InvalidActivityException extends RuntimeException{
	String act ;
	InvalidActivityException() {}
	InvalidActivityException(String act){
		this.act = act;
	}
	public String getMessage() {
		return "not a valid activity" +act;
	}
	public String toString(){
		return "invalid act" +getMessage();
	}
} 

class Activity{
	
	public void checkActivity(String act){
		try {
			if(act == "play"){
				throw new InvalidActivityException(act);
			}else{
				System.out.println("Activity is OK...");
			}
		} catch (Exception e) {
			System.out.println("Catch Block " +e );
		}	
	}
}
public class UserDefinedExceptionTest {
	public static void main(String[] args) {		
		String event = "play";
		Activity activity = new Activity();
		activity.checkActivity(event);
		System.out.println("Program ends");
	}
}
