package com.java.jlc.jdbc;
import java.sql.*;

import com.java.jlc.jdbc.JDBCUtil;

public class JdbcLab07 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = JDBCUtil.getMySqlConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getJDBCMajorVersion());
			System.out.println(dbmd.getJDBCMinorVersion());
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDefaultTransactionIsolation());
			System.out.println(dbmd.supportsTransactions());
			System.out.println(dbmd.supportsBatchUpdates());
			System.out.println(dbmd.getDriverName());
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			JDBCUtil.cleanup(ps, con);
		}
	}
}
