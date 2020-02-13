package com.cts.project.example.dao;

import java.util.List;

import com.cts.project.example.model.UserDemo;

public interface UserDemoDAO {

	public boolean saveUser(UserDemo user);
	
	public boolean updateUser(UserDemo user);
	
	public boolean deleteUser(UserDemo user);
	
	public UserDemo getUserById(int id);
	
	public List<UserDemo> getAllUsers();
	
}
