package com.sapient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int user_id;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String user_role;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String email, String password, String user_role) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.user_role = user_role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
	
}
