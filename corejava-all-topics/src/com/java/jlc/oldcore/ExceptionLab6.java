package com.java.jlc.oldcore;

class InvalidAccNoException extends Exception{
	int accNo;
	InvalidAccNoException() {}
	InvalidAccNoException(int accno){
		this.accNo=accno;
	}
	public String getMessage(){
		String msg = null;
		if(accNo == 0){
			msg = "Acc no is Available";
		}else{
			msg = "Acc No:" +accNo +"not available";
		}
		return msg;
	}
	public String toString(){
		return "InvalidAccNoException :" +getMessage();
	}
}
class InsufficientFundsException extends RuntimeException{
	int bal;
	InsufficientFundsException() {}
	InsufficientFundsException(int bal){
		this.bal=bal;
	}
	public String getMessage(){
		String msg = null;
		if(bal == 0){
			msg = "Sorry You dont have enough funds.";
		}else{
			msg = "Sorry you dont have Amount :" +bal;
		}
		
		return msg;
	}
	public String toString(){
		return "InsufficientFundsException :" +getMessage();
	}
}
class Account{
	int bal = 5000;
	int getBal(int accno){
		try{
			if(accno>100){
				throw new InvalidAccNoException(accno);
			}else{
				return bal;
			}
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());			
			return bal;
		}		
	}
	void withdraw(int accNo, int amt){
		try{
			if(accNo>100){
				throw new InvalidAccNoException(accNo);
			}
			else{
				if(amt+1000>bal){
					throw new InsufficientFundsException(amt);
				}else{
					bal = bal-amt;
				}
			}
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
public class ExceptionLab6 {
	
	public static void main(String[] as) {
		
		try{
			int accNo = Integer.parseInt(as[0]);
			int amt = Integer.parseInt(as[1]);
			Account acc = new Account();
			System.out.println(acc.getBal(accNo));
			acc.withdraw(accNo, amt);
			System.out.println(acc.getBal(accNo));
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		} 
	}
}
