package com.core.jdbc.ds.util.JDBCJBossClient;

import java.sql.*;
import java.util.Properties;

import javax.naming.*;
import javax.sql.DataSource;


public class JDBCUtil extends RuntimeException {
	private static DataSource ds=null;
	static{
		try{
			Properties p=new Properties();
			p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			p.put("java.naming.provider.url", "localhost:1099");
			p.put("java.naming.factory.url.pkgs","org.jboss.naming" );
			Context ctx=new InitialContext(p);
			Object obj=ctx.lookup("sss");
			ds=(DataSource)obj;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	static public Connection getConnection()throws SQLException{
		
		return ds.getConnection();
		
	}
	static public void cleanUp(Statement st,Connection con)
	{
		try
		{
			if(st!=null)
			{
				st.close();
			}
			if(con!=null)
			{
				con.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static public void cleanUp(ResultSet rs,Statement st,Connection con)
	{
		try
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(st!=null)
			{
				st.close();
			}
			if(con!=null)
			{
				con.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
