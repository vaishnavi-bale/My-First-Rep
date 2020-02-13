package com.cts.project.example.model;

import java.io.Serializable;

public class UserDemo implements Serializable{

	private static final long serialVersionUID = 6271891508468002546L;
	
 private int id;
 private String userName;
 private String password;
 
 public UserDemo() {
	 
 }

public UserDemo(int id, String userName, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
}
 
}
