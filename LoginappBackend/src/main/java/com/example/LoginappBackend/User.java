package com.example.LoginappBackend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String username;
	@Column
	String password;
	@Column
	int salary;
	
	public User() {
		super();
	}

	public User(int id, String username, String password, int salary) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.salary = salary;
	}

	public User(String username, String password, int salary) {
		super();
		this.username = username;
		this.password = password;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salary=" + salary + "]";
	}
	
	
	
}
