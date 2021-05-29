package com.core.jdbc.transaction;
import java.sql.*;
import java.util.Enumeration;

import com.core.jdbc.JDBCUtil;
public class Account {
	int bal;
	int dabal, sabal, danbal, sanbal;
	public void transfer(int sa, int da, int amt){
		Connection con = null;
		PreparedStatement ps1 = null, ps2 = null;
	
		try{
			con = JDBCUtil.getMySqlConnection();
			//start TX
			//con.setAutoCommit(false);
			//op1
			ps1 = con.prepareStatement("select bal from account where accno=?");
			ps1.setInt(1, da);
			ResultSet rs1 = ps1.executeQuery();
			if(rs1.next()){
				dabal=rs1.getInt(1);
			}
			else{
				throw new InvalidAccountNumberException(da);
			}
			danbal = dabal + amt;

			//Op2
			ps2 = con.prepareStatement("update account set bal = ? where accno = ?");
			ps2.setInt(1, sanbal);
			ps2.setInt(2, sa);
			ps2.executeUpdate();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();					
			}catch(Exception e1){
				System.out.println(e);
			}
		}
		finally{
			JDBCUtil.cleanup(ps1, con);
			JDBCUtil.cleanup(ps2, con);
		}
	}
}