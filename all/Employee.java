package com.cts.interface1;

public class Employee {
     private int emp_id;
     private String name,addr;
     private int age;
     private long phone;
     private double sal;
	public Employee(int emp_id, String name, String addr, int age, long phone, double sal) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.phone = phone;
		this.sal = sal;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", addr=" + addr + ", age=" + age + ", phone=" + phone
				+ ", sal=" + sal + "]";
	}
     
     
}
