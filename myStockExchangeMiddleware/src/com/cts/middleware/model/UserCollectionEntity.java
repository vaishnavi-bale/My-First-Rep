package com.cts.middleware.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UserCollectionEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9158140467639649942L;
	private int id;
	private String username;
	private String password;
	private List<String> email;
	private long phone;
	private boolean enabled;
	private AddressEntity addressEntity;
	
	
	public UserCollectionEntity(int id, String username, String password, List<String> email, long phone,
			boolean enabled, AddressEntity addressEntity) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.addressEntity = addressEntity;
	}
	public UserCollectionEntity() {
		
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
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}
	@Override
	public String toString() {
		return "UserCollectionEntity [id=" + id + ", username=" + username + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", enabled=" + enabled + ", addressEntity=" + addressEntity + "]";
	}
	
	
}
