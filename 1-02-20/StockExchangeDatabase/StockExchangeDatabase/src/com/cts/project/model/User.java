package com.cts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class User implements Serializable{
	
	private static final long serialVersionUID = 8157378947794249236L;
	@Id
	private int id;
     private String fullName;
     private String email;
     private long phone;
     private String userName;
     private String password;
     
     public User() {
    	 
     }
	public User(int empId, String fullName, String email, long phone, String userName, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setEmpId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
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
		return "id=" + id + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone
				+ ", userName=" + userName + ", password=" + password;
	}
     
     
}
