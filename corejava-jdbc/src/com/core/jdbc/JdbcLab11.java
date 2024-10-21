//Example using batch update
package com.core.jdbc;
import java.sql.*;
public class JdbcLab11 {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			con = JDBCUtil.getMySqlConnection();
			st = con.createStatement();
			
			String s1 = "select * from jlcbooks";
			rs = st.executeQuery(s1);
			while(rs.next()){
				rs.getString(1);
				rs.getString(2);
				rs.getString(3);
				rs.getString(4);
				rs.getString(5);
				rs.getString(6);
				rs.getString(7);
			}
			
			/*
			st.addBatch(s1);
			String s2 = "insert into jlcbooks values('B-12','JDBC','Vas','JLC','150','4','123-002')";
			st.addBatch(s2);*/
//			String s1 = "insert into jlcbooks values('B-11','Java','Sri','JLC','100','3','123-001')";
//			st.addBatch(s1);
//			String s2 = "insert into jlcbooks values('B-12','JDBC','Vas','JLC','150','4','123-002')";
//			st.addBatch(s2);
//			String s3 = "insert into jlcbooks values('B-13','JSF','Tom','JLC','200','5','123-003')";
//			st.addBatch(s3);
//			String s4 = "insert into jlcbooks values('B-14','XML','Lee','JLC','300','5','123-004')";
//			st.addBatch(s4);
//			String s5 = "update jlcbooks set cost=200, edition=3 where bid='B-14'";
//			st.addBatch(s5);
//			String s6 = "delete from jlcbooks where bid = 'B-13'";
//			st.addBatch(s6);
//			int x[] = st.executeBatch();
			st.executeBatch();
//			System.out.println(x[0]);
//			for(int i = 0;i<x.length;i++){
//				System.out.println(x[3]);
//			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
