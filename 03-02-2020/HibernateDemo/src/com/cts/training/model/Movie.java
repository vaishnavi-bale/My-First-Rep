package com.cts.training.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
@Id
@GeneratedValue
	private long id;
private String mname;
@OneToMany(mappedBy = "movie")
private Set<Actor> actors;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}

}
