package com.java.jlc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Type-2 using Oracle 10g
public class Test2 {
public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
		//1. Loading the Driver Class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Create the connection
		con=DriverManager.getConnection("jdbc:oracle:oci8:@localhost:1521:XE", "system", "jlcindia");
		//3. Prepare SQL Statement
		String sql="insert into b33Student values(101,'amit', 'amit@jlc',973943,1700.00)";
		//4. Create the JDBC statement
		st=con.createStatement();
		//5. Submit the query to DataBase
		int res=st.executeUpdate(sql);
		//6. Process the results
		System.out.println("Result :" +res);
		if(res>=1)
			System.out.println("Record inserted");
		else
			System.out.println("Record not inserted");
		}catch (ClassNotFoundException e) {
			System.out.println("Driver Class not found");
		}catch (SQLException e) {
			e.printStackTrace();
		}
}
}
