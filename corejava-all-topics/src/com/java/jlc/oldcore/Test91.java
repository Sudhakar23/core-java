package com.java.jlc.oldcore;
//package com.jlc.exception;

class InvalidUserIdException extends Exception{
	String userID;
	public InvalidUserIdException(){}
	InvalidUserIdException(String userID){
		this.userID = userID;
	}
	public String getMessage(){
		return "User ID" + userID +" is invalid try again...";
	}
	public String toString(){
		return "Invalid UserID Exception" +getMessage();
	}
}
class ServerDoesNotResponseException extends RuntimeException{
	
}
class Chat{
	String userID;
	public Chat(){
		
	}
	Chat(String userID){
		this.userID = userID;		
	}
	void startChat(){
		try{
			if(userID.equals("som")){
				System.out.println("Starting chat...");
			}else{
				throw new InvalidUserIdException(userID);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

public class Test91 {

	public static void main(String[] args) {
		String userID = args[0];
		System.out.println("before calling char(userID)");
		Chat ch = new Chat(userID);
		ch.startChat();

	}

}
