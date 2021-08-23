package com.jaydan;

public class EmployeeDaoFactory {
	private static EmployeeDAO dao;
	
	private EmployeeDaoFactory () {}
		static EmployeeDAO getEmployeeDAO() throws ClassNotFoundException {
			if(dao == null)
				dao = new EmployeeDaoImpl();
				return dao;
	}

}
