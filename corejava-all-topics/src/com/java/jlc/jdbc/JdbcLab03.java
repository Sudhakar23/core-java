package com.java.jlc.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import com.jdbc1.*;
public class JdbcLab03 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
//		int sid = Integer.parseInt(args[0]);
//		String name = args[1];
//		String email = args[2];
		int sid = 101;
		String name = "Tom";
		String email = "june@hotmail";
		
		try{
			con = JDBCUtil.getMySqlConnection();
//			st = con.createStatement();
//			String sql1 = "insert into student values("
//					+sid +",'" +name +"','"+email +"')";
//			int x = st.executeUpdate(sql1);
			ps = con.prepareStatement("select * from student");
			rs = ps.executeQuery();
			while(rs.next()){
				sid = rs.getInt(1);
				name = rs.getString(2);
				email = rs.getString(3);
				System.out.println(
						"sid :" +sid +"name :" +name
						+"email :" +email);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(st, con);
			JDBCUtil.cleanup(con, ps, rs);
		}
	}
}
