package com.java.jlc.jdbc.curd;

import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

	public static Connection getOracleConnection() {
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
			Properties p = new Properties();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

	public static Connection getMySqlConnection() {
		Connection con = null;
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/b27jdbc", "root", "jlcindia");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void cleanup(Connection con, Statement st) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cleanup(Connection con, PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
