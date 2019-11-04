package com.loginapp.dao;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginData implements Serializable
{
	private String uname,password,name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LoginData() 
	{
		super();
	}

	public String getUname() 
	{
		return uname;
	}

	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}
