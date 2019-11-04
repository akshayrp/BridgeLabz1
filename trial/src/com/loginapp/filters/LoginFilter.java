package com.loginapp.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginFilter implements Filter 
{


	public void init(FilterConfig fConfig) throws ServletException {}
	
	public void requestmethod(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
		dispatcher.forward(request,response);
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		int count = 0;
		
		if (uname.isEmpty())
		{
			request.setAttribute("unameErrMessage","UserName field cannot be empty");
			requestmethod(request, response);
			count++;
		}
		if(uname.length() <= 4)
		{
			request.setAttribute("unameErrMessage","UserName should be greater than 4");
			requestmethod(request, response);
			count++;
			
		}
		if(uname.matches("^[a-zA-Z0-9]+$") == false)
		{
			request.setAttribute("nameErrorMessage","UserName should only contain Alpha-Numeric characters");
			requestmethod(request, response);
			count++;
		}		
		
		if(pass.isEmpty())
		{
			request.setAttribute("passErrMessage","Password Field cannot be empty");
			requestmethod(request, response);
			count++;
		}
		if(pass.length() < 6)
		{
			request.setAttribute("passErrMessage","Password length should be greater than 6");
			requestmethod(request, response);
			count++;
		}
		if(count == 0)
		{
			chain.doFilter(request, response);
		}
	}

	public void destroy() {}
	

}
