package com.bridgelabz.servlet.demoapp;

import java.io.IOException;

import javax.servlet.http.*;

public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		
		response.getWriter().print("Result is "+k);
	}
}
