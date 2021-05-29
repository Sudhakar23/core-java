package com.core.jdbc;
import java.sql.*;
//import com.mysql.jdbc.PreparedStatement;

public class Lab04_som {

	public static void main(String[] args) {
/*		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
*/		
		int a = 12;
		int b = 23;
		
		Connection con = null; CallableStatement cs = null;
		try{
		con = JDBCUtil.getOracleConnection();
		cs = con.prepareCall("{call p1(?,?)}");
		cs.setInt(1, a);
		cs.setInt(2, b);
		int x = cs.executeUpdate();
		System.out.println(x);
		if(x == 0 )
			System.out.println("Call is successful...");
		else 
			System.out.println("Call is not successful...");
		}catch(Exception e){
			e.getStackTrace();
		}	

	}

}
