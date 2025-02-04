package com.loginapp.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.loginapp.dao.LoginData;
import com.loginapp.provider.Provider;



public class Service 
{
	LoginData dataBean = new LoginData();
	
	public boolean checkDB(String uname,String password) throws ClassNotFoundException, SQLException
	{
		dataBean.setUname(uname);
		dataBean.setPassword(password);
		PreparedStatement pstmt = Provider.connect().prepareStatement("select * from logindetail where uname= ? and password = ?");
		pstmt.setString(1, uname);
		pstmt.setString(2, password);
		
		ResultSet result = pstmt.executeQuery();
		
		while(result.next())
		{
			if(result.getString(3).equals(uname) && result.getString(4).equals(password))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	public void newuser(String name,String uname,String password) throws ClassNotFoundException, SQLException
	{
		
		dataBean.setName(name);
		dataBean.setUname(uname);
		dataBean.setPassword(password);
		
		String query="insert into logindetail(name,uname,password) values (?,?,?)";
		
		
		PreparedStatement pstmt = Provider.connect().prepareStatement(query);
		pstmt.setString(1,name);
		pstmt.setString(2,uname);
		pstmt.setString(3,password);
		pstmt.executeUpdate();

	}
}
