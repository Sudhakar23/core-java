package com.core.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab03 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int sid = 101;
		String name = "sudhakar";
		String city = "blore";
		String email = "sudh@jlc";
		int contact = 12234;
		try {
			con = JDBCUtil.getMySqlConnection();
			st = con.createStatement();
			String sql = "insert into studinfo values(" + sid + ",'" + name
					+ "', '" + city + "','" + email + "'," + contact + ")";
			int i = st.executeUpdate(sql);
			if (i == 1) {
				System.out.println("Ok.......");
			} else {
				System.out.println("Not Ok...");
			}

			String sql2 = "update studinfo set city = ?";
			ps = con.prepareStatement(sql2);
			ps.setString(1, "chennai");
			ps.executeUpdate();
//			rs = ps.executeQuery();
//			int a = ps.executeUpdate();
//			System.out.println(a);
			
//			Statement st2 = con.createStatement();
			ps.executeUpdate("update studinfo set sid = 110");
			
			rs = ps.executeQuery("select * from studinfo");
			while (rs.next()) {
				sid = rs.getInt(1);
				name = rs.getString(2);
				city = rs.getString(3);
				email = rs.getString(4);
				contact = rs.getInt(5);

				System.out.println(sid +" "	+" " +name+" " +city+" " +email +" " +contact );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(st, con);
			JDBCUtil.cleanup(con, st, rs);
		}

	}
}
