package com.java.jlc.jdbc;

import java.sql.*;

import com.java.jlc.jdbc.JDBCUtil;

public class JdbcLab09 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySqlConnection();
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

//			st = con.createStatement();

			String SQL = "select * from jlcbooks";
			rs = st.executeQuery(SQL);
			System.out.println("\nIn forward order");
			String bid = null, bn = null, au = null, pub = null, co = null, is = null, edi = null;
			
			while (rs.next()) {
				bid = rs.getString(1);
				bn = rs.getString(2);
				au = rs.getString(3);
				pub = rs.getString(4);
				co = rs.getString(5);
				is = rs.getString(6);
				edi = rs.getString(7);
				System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co
						+ "\t" + is + "\t" + "\t" + edi);
			}

			System.out.println("\nIn Reverse order");
			while (rs.previous()) {
				bid = rs.getString(1);
				bn = rs.getString(2);
				au = rs.getString(3);
				pub = rs.getString(4);
				co = rs.getString(5);
				is = rs.getString(6);
				edi = rs.getString(7);
				System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co
						+ "\t" + is + "\t" + "\t" + edi);
			}

			System.out.println("\n2nd Record");
			rs.absolute(2);
			
			bid = rs.getString(1);
			bn = rs.getString(2);
			au = rs.getString(3);
			pub = rs.getString(4);
			co = rs.getString(5);
			is = rs.getString(6);
			edi = rs.getString(7);
			System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co + "\t"
					+ is + "\t" + "\t" + edi);

		System.out.println("Last Record");
			rs.last();
			bid = rs.getString(1);
			bn = rs.getString(2);
			au = rs.getString(3);
			pub = rs.getString(4);
			co = rs.getString(5);
			is = rs.getString(6);
			edi = rs.getString(7);
			System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co + "\t"
					+ is + "\t" + "\t" + edi);

			System.out.println("\nFirst Record");
			rs.first();
			bid = rs.getString(1);
			bn = rs.getString(2);
			au = rs.getString(3);
			pub = rs.getString(4);
			co = rs.getString(5);
			is = rs.getString(6);
			edi = rs.getString(7);
			System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co + "\t"
					+ is + "\t" + "\t" + edi);

			System.out.println("\n4th Record");
			bid = rs.getString(1);
			bn = rs.getString(2);
			au = rs.getString(3);
			pub = rs.getString(4);
			co = rs.getString(5);
			is = rs.getString(6);
			edi = rs.getString(7);
			System.out.println(bid + "\t" + bn + "\t" + au + "\t" + co + "\t"
					+ is + "\t" + "\t" + edi);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, st, rs);
		}

	}

}
