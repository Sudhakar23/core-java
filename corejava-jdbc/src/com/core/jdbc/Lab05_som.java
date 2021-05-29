package com.core.jdbc;
import java.sql.*;
//import java.sql.Types;

public class Lab05_som {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		Connection con = null; CallableStatement cs = null;
		try{
			con = JDBCUtil.getOracleConnection();
			cs = con.prepareCall("{call p2(?,?,?,?,?,?)}");
			cs.setInt(1, a);
			cs.setInt(2, b);
		
			cs.registerOutParameter(3, Types.INTEGER);
			cs.registerOutParameter(4, 4);
			cs.registerOutParameter(5, 4);
			cs.registerOutParameter(6, 4);
		
		
			int x = cs.executeUpdate();
			System.out.println(x);
			if(x == 0 )
				System.out.println("Call is successful...");
			else 
				System.out.println("Call is not successful...");
		
			int c = cs.getInt(3);
			int d = cs.getInt(4);
			int e = cs.getInt(5);
			int f = cs.getInt(6);
			System.out.println(c +" " +d +" " + e +" " +f );

		}catch(Exception e){
			e.getStackTrace();
		}	

	}

}
