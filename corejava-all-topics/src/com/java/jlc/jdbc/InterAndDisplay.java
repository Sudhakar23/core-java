package com.java.jlc.jdbc;

import java.sql.*;

public class InterAndDisplay {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int sid = 104;
		String name = "Jee";
		String email = "adam@gmail";
		
			try {
				//1 insert
				con = JDBCUtil.getMySqlConnection();
//				st = con.createStatement();
//				String sql = "insert into student values("
//						+sid +",'" +name +"','"+email +"')";
//				st.executeUpdate(sql);
				
				//2 display
				ps = con.prepareStatement("select * from student");
//				rs = ps.executeQuery();
				rs = ps.executeQuery("select * from student");
				System.out.println("sid \t name \t email");
				while(rs.next()){
					sid = rs.getInt(1);
					name = rs.getString(2);
					email = rs.getString(3);
					System.out.println(sid +"\t" +name +"\t" +email);
				}
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
