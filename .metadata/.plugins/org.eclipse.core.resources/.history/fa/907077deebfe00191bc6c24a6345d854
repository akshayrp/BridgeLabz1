package com.loginapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Register extends HttpServlet
{
	Service service = new Service();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");

			try 
			{
				service.newuser(name, uname, password);
				System.out.println("success");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
				dispatcher.forward(request,response);
			}
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}

	}
	
}
