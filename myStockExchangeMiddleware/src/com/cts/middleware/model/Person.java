package com.cts.middleware.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
private List<String>list;
private Set<String>string;
private Map<Integer,String>map;
private Properties properties;


public Person(List<String> list, Set<String> string, Map<Integer, String> map, Properties properties) {
	super();
	this.list = list;
	this.string = string;
	this.map = map;
	this.properties = properties;
}
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Set<String> getString() {
	return string;
}
public void setString(Set<String> string) {
	this.string = string;
}
public Map<Integer, String> getMap() {
	return map;
}
public void setMap(Map<Integer, String> map) {
	this.map = map;
}
public Properties getProperties() {
	return properties;
}
public void setProperties(Properties properties) {
	this.properties = properties;
}
@Override
public String toString() {
	return "Person [list=" + list + ", string=" + string + ", map=" + map + ", properties=" + properties + "]";
}

}
