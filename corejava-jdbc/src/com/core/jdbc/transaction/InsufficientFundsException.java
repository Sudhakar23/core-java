package com.core.jdbc.transaction;

public class InsufficientFundsException extends Exception{
	InsufficientFundsException(){}
	public String toString(){
		return "Sufficient Funds are Not Available";
	}
}
