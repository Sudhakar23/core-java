package com.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Test {
	public static void main(String[] args){
	Connection con=null;
	Statement st=null;
	try{
	   //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("hello");
		con=DriverManager.getConnection("jdbc:odbc:b27","system","jlcindia");
		//System.out.println("hello");
			String sql="insert into student1 values(1,'anand','jbp')";
			st=con.createStatement();
			int res=st.executeUpdate(sql);
			System.out.println("Result:"+res);
			if(res>1)
			{
				System.out.println("record inserted");
			}
			
}catch(Exception e)
{
	e.printStackTrace();
	System.out.println("Driver class not found");
}finally{
	try{
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
}
