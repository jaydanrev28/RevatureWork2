package com.jaydan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeDaoImpl   implements EmployeeDAO{

	private static Statement statement = null;
	Connection connection = null;
	
	public EmployeeDaoImpl() throws ClassNotFoundException {
		try {
			this.connection = ConnectionFactory.getConnection();
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
	}
	
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		String sql = " insert into employee (name, email, city) values (?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		preparedStatement.setString(3, employee.getCity());
		int count = preparedStatement.executeUpdate();
		if(count > 0) {
			System.out.println("Employee Saved!");
		}else {
			System.out.println("Oops there's been a mistake!");
		}
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
