package com.loginapp.provider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider 
{
	public static Connection connect() throws ClassNotFoundException, SQLException
	{
		
		final String URL = "jdbc:mysql://localhost:3306/bridgelabz";
		final String UNAME = "root";
		final String PASS = "admin@123";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL,UNAME,PASS);
		
		return con;
	}
}
