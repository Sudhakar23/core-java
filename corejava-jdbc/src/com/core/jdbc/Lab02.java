package com.core.jdbc;
import java.sql.*;
public class Lab02 {

	public static void main(String[] args) {
//		int sid = Integer.parseInt(args[0]);
//		String name = args[1];
//		int contact = Integer.parseInt(args[2]);
		int sid = 101;
		String name = "teswt";
		int contact = 232323;

		
		//1. Load the driver
		try{
			Class.forName("Oracle.jdbc.driver.OracleDriver");
		
		//2. Get Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE");
		
		//3. Create statement 
		Statement st = con.createStatement();		
		
		//4. Prapare SQL Query
		String sql = "insert into student values("+sid+",'"+name+"',"+contact+")";
		
		//5. Submit Query to DB   
		int x = st.executeUpdate(sql);
		
		//6. Process the result
		System.out.println(sql);
		if(x==1){
			System.out.println("Ok...");
		}else {
			System.out.println("Not ok...");
		}
		con.close();
		st.close();
		
		}catch(Exception e){
			
		}
		
	}

}

