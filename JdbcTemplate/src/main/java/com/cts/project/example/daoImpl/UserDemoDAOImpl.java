package com.cts.project.example.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.project.example.dao.UserDemoDAO;
import com.cts.project.example.model.UserDemo;

public class UserDemoDAOImpl implements UserDemoDAO{
	private JdbcTemplate jdbcTemplate;

	public boolean saveUser(UserDemo user) {
		String query=" insert into userDemo values(?,?,?)";
		try {
			jdbcTemplate.update(query, user.getId(),
			               user.getUserName(),user.getPassword());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateUser(UserDemo user) {
	    String query="update userDemo set userName=?, password=? where id =?";
	    try {
			jdbcTemplate.update(query,user.getUserName(),
					user.getPassword());
			return true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteUser(UserDemo user) {
		// TODO Auto-generated method stub
		return false;
	}

	public UserDemo getUserById(int id) {
		String query="select * from userDemo where id=?";
	    RowMapper<UserDemo> rowMapper=new BeanPropertyRowMapper<UserDemo>(UserDemo.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	public List<UserDemo> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
