package com.core.jdbc;

import java.sql.*;

import com.core.jdbc.JDBCUtil;

public class JdbcLab08 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySqlConnection();
			ps = con.prepareStatement("select * from jlcbooks");
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			int cc = rsmd.getColumnCount();

			// ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
			// ResultSetMetaData rsmd = rs.getMetaData();
			// int numberOfColumns = rsmd.getColumnCount();
			// boolean b = rsmd.isSearchable(1);

//			rs.next();
			System.out.println(cc);
			System.out.print(rsmd.getTableName(cc));
			for (int i = 1; i <= cc; i++) {

//				System.out.print(rsmd.getColumnName(i));
//				System.out.print(rsmd.getTableName(i));
//				System.out.print(" " +rsmd.getColumnDisplaySize(i) +" ");
//				System.out.print(rsmd.getColumnClassName(i));
				 System.out.print(" " +rsmd.getColumnLabel(i));
				 System.out.print(rsmd.getColumnTypeName(i));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(ps, con);
		}
	}
}
