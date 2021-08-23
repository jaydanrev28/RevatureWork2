package com.jaydan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.print("Welcome "+ name);
		
		// append the username in the query string
		out.println("<h1><a href='Servlet4?name="+ name+ "'>Click Here</a></h1>");
		out.close();
		
		
		
	}

}
