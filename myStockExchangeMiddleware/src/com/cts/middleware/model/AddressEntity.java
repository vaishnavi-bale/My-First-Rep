package com.cts.middleware.model;

import java.io.Serializable;

public class AddressEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6072898226845464155L;
	private int id;
	private String houseNumber;
	private String street;
	private String city;
	private String state;

	public AddressEntity() {
		
	}
	public AddressEntity(int id, String houseNumber, String street, String city, String state) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
