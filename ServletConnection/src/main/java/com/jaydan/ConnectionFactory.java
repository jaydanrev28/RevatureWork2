package com.jaydan;

import java.sql.Connection;
import java. sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
	private static Connection connection = null;
	private ConnectionFactory() {}
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		if(connection == null) {
			String url = "jbdc:mysql://localhost:3306/revature";
			String username = "root";
			String password = "LinuxGang2020!";
			
			connection = DriverManager.getConnection(url,username, password);
		}
		return connection;
	}
}
