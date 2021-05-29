package com.java.exception;

class InvalidUserIdException extends Exception{
	String userID;
	public InvalidUserIdException(){}
	
	InvalidUserIdException(String userID){
		this.userID = userID;
		toString();
	}
	public String getMessage(){ 
		return ("User ID " + userID +" is invalid try again...");
	}

	public String toString(){
		return ("***InvalidUserIDException***\n" +getMessage());
	}
}
/*class ServerDoesNotResponseException extends RuntimeException{
	
}*/
class Chat{
	String userID;
	public Chat(){

	}
	Chat(String userID){
		this.userID = userID; 
	}
	void startChat(){
		
		try{
			if(userID.equals("sudhakar")){
				System.out.println("Welcome to chat...");
			}else{
				System.out.println("...throw InvalidUserIdException...");
				throw new InvalidUserIdException(userID);
			}
		}catch(Exception e){
			System.out.println("Inside Chat catch block :");
			System.out.println(e);
		}
	}
}
public class Test91 {

	public static void main(String[] args) {
//		String userID = args[0];//poi
		String userID = "sbkakar";
		//System.out.println("before calling char(userID)");//
		Chat ch = new Chat(userID);
		//System.out.println("before starting start char");//
		ch.startChat();
	}
}