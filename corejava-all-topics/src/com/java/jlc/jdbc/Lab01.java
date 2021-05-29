package com.java.jlc.jdbc;
import java.sql.*;
public class Lab01 {

	public static void main(String[] args) {
	
//		int sid = Integer.parseInt(args[0]);
//		String name = args[1];
//		String city = args[2];
//		String email= args[3];
//		int contact = Integer.parseInt(args[4]);
		int sid = 104;
		String name = "Ravi";
		String city = "Delhi";
		String email= "amit@delhi";
		int contact = 1478589;
		
		try{
			//1. Load the Driver Class
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//2. Get the Connection
			Connection con = DriverManager.getConnection("jdbc:odbc:b27","system","jlcindia");
			
			//3. Create Statement
			Statement st = con.createStatement();
			
			//4. Prepare SQL statement
			String sql = "insert into student2 values("+sid+",'"+name+"')";
			//5. Submit the query to database
			int i = st.executeUpdate(sql);
			System.out.println(sql);
			System.out.println(i);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}