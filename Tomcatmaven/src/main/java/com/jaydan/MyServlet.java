package com.jaydan;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


	


	public class MyServlet implements Servlet{

		ServletConfig config;
		
		@Override
		public void init(ServletConfig config) throws ServletException {
			this.config = config;
			System.out.println("creating object...");
		}
		
		@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
			System.out.println("servicing  ...");
			
		}
		
		@Override
		public void destroy() {
			System.out.println("going to destroy servle object...");
			
		}

		@Override
		public ServletConfig getServletConfig() {
			return this.config;
		}

		@Override
		public String getServletInfo() {
			return "this servlet created by admin";
		}

		

		

	}


