package com.jdbc;

 
import java.sql.*;

public class JDBCUtil {
	public static Connection MyConnection() {
		Statement st=null;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc", "root", "jlc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	static public void cleanup(Statement st,Connection con ){
		try{
			
			if(con!=null)	
			con.close();
			if(st!=null)
				st.close();
		}catch(Exception e){
			//System.out.println(e);
		}
	}
}
