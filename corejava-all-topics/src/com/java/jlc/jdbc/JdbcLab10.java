package com.java.jlc.jdbc;
import java.sql.*;

import com.java.jlc.jdbc.JDBCUtil;
public class JdbcLab10 {
			
	public static void main(String[] args) {
			
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySqlConnection();
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String SQL = "select * from jlcbooks";
			rs = st.executeQuery(SQL);
			
			System.out.println("Before Updating");
			String bid = null,
					bn = null,
					au = null,
					pub = null,
					co = null,
					is = null,
					edi = null;
			
			while(rs.next()){
				bid = rs.getString(1);
				bn = rs.getString(2);
				au = rs.getString(3);
				pub = rs.getString(4);
				co = rs.getString(5);
				is = rs.getString(6);
				edi = rs.getString(7);
				System.out.println(bid +"\t" +bn +"\t" +au +"\t" +co +"\t" +is +"\t" +"\t" +edi);
			}
			//insert row 
			rs.moveToInsertRow();
			rs.updateString(1, "B-11");
			rs.updateString(2, "Spring");
			rs.updateString(3, "SD");
			rs.updateString(4, "JLC");
			rs.updateString(5, "999");
			rs.updateString(6, "1");
			rs.updateString(7, "99-99");
			
			rs.insertRow();
			
			System.out.println("After updating ");
			rs.beforeFirst();
			while(rs.next()){
				bid = rs.getString(1);
				bn = rs.getString(2);
				au = rs.getString(3);
				pub = rs.getString(4);
				co = rs.getString(5);
				is = rs.getString(6);
				edi = rs.getString(7);
				System.out.println(bid +"\t" +bn +"\t" +au +"\t" +co +"\t" +is +"\t" +"\t" +edi);
			}
			
		}catch(Exception e){
			
		}
		finally{
			JDBCUtil.cleanup(con, st, rs);
		}
		
	}

}
