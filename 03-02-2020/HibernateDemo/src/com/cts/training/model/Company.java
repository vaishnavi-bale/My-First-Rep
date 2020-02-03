package com.cts.training.model;

import java.io.Serializable;

public class Company implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 7100174271074197918L;
private int id;
 private String name;
 private String sector;
 private String ceoName;
 private double turnOver;
 
 Company(){
	 
 }

public Company(int id, String name, String sector, String ceoName, double turnOver) {
	super();
	this.id = id;
	this.name = name;
	this.sector = sector;
	this.ceoName = ceoName;
	this.turnOver = turnOver;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSector() {
	return sector;
}

public void setSector(String sector) {
	this.sector = sector;
}

public String getCeoName() {
	return ceoName;
}

public void setCeoName(String ceoName) {
	this.ceoName = ceoName;
}

public double getTurnOver() {
	return turnOver;
}

public void setTurnOver(double turnOver) {
	this.turnOver = turnOver;
}
}
