package com.java.collections.scjp;

import java.util.HashMap;
import java.util.Map;

 class AccountManager{
	private Map AccountTotals=new HashMap();
	 private Map<String, Integer>accountTotals=new HashMap<String, Integer>();
	private int retirementFund;
	
	public int getBalance(String accountName){
	
		Integer total=(Integer) accountTotals.get(accountName);
		if (total==null) {
			total=Integer.valueOf(0);
		}
		return total.intValue();
	}
	public void setBalance(String accountName,int amount){
		//accountTotals.put(accountName, Integer.valueOf(amount));
		accountTotals.put(accountName, amount);
	}
}
public class Selftest5 {
public static void main(String[] args) {
	AccountManager am=new AccountManager();
	am.setBalance("55", 666);
	System.out.println(am.getBalance("55"));
	System.out.println();
}
}
