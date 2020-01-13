package com.cts.inherit;

public class OverridingDemo {
public static void main(String args[]) {
Emp_1 e= new Emp_1();
e.display();
Manager_1 m=new Manager_1();
m.display();
Emp_1 e1=new Manager_1();
e1.display();
}
}
class Emp_1{
	public void display() {
		System.out.println("employee class");
	}
}
class Manager_1 extends Emp_1{
	public void display() {
		System.out.println("manager class");
	}
}