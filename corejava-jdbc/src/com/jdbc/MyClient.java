package com.jdbc;

import java.sql.*;

public class MyClient {
	public static void main(String[] args) {
	try{
		String uid = "userName";
		String psd = "pwd";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		con = JDBCUtil.MyConnection();
		st = con.createStatement();	
		String sql = "select * from user";
		rs = st.executeQuery(sql);
		
		while(rs.next()){
			if( uid.equals(rs.getString(1))){
				if(psd.equals(rs.getString(2)))
				System.out.println("user does exist");
				
			}			else{
				System.out.println("user does not exist");
			}

		}		
				//			uid = rs.getString(1);
//			psd = rs.getString(2);
			
//			System.out.println(uid);
//			System.out.println(psd);
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
