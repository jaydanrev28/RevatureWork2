package com.jaydan;

public class Employee {
	private int emp_id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private int type;
	public Employee(int emp_id, String firstName, String lastName, String username, String password, String email, int type) {

		this.emp_id = emp_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.type = type;
	}
	public int getId() {
		return emp_id;
	}
	public void setId(int id) {
		this.emp_id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	


}
