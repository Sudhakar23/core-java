package com.java.jlc.jdbc.transaction;
import java.sql.*;
public class JbcLab13 {
	
	public static void main(String[] args) {
		Account acc = new Account();
		acc.transfer(99,80,5000);
	}
}
