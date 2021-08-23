package com.jaydan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet  extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
System.out.println("this is get method of my servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Get Method called</h1>");
		out.print(new Date().toString());
	}

}
