package com.jaydan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		 
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setCity(city);
		
		
		try {
		EmployeeDAO dao = EmployeeDaoFactory.getEmployeeDAO(); 
		dao.addEmployee(employee);
		out.println("Employee record inserted");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
				}
	}
}
