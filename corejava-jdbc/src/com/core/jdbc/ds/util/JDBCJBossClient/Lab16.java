package com.core.jdbc.ds.util.JDBCJBossClient;
import java.sql.*;
public class Lab16 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from jlcstudent");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanUp(rs, st, con);
		}
	}

}
