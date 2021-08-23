package com.jaydan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet6 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		HttpSession session = request.getSession(false);
		String name =  (String)session.getAttribute("uname");
		
		// getting the value from query string
		
		out.print("Welcome "+ name);
		out.close();
	}
}