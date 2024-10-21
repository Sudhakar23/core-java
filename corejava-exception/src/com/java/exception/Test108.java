//Other class notes
package com.java.exception;

class InvalidIdException extends Exception{
	String userId;
	public InvalidIdException(){}
	InvalidIdException(String userId){
		System.out.println("inside IUE " +userId);
		this.userId = userId;
		toString();
	}
	public String getMessage(){
		return "\nuserId : " +userId +" is valid";  
	}
	public String toString(){
		return "Invalid UserId Exception :" +getMessage();
	}
}
/*class ServerDoesNotRespondException extends RuntimeException{
	
}*/
class ConnectToServer{
	public void ConnectToChat(String userId){
		try{
			if(userId.equals("sudhakar")){
				System.out.println("You are welcome...");
			}
			else{ 
				System.out.println("Sorry! try again...");
				throw new InvalidIdException(userId);
			}
		}catch(Exception e){
			System.out.println("Inside ConnectToChat catch block " +e +"\b");
		}
	}
}

public class Test108 {
	public static void main(String[] args) {
		ConnectToServer cts = new ConnectToServer();
		cts.ConnectToChat("sudhr");
	}
}
