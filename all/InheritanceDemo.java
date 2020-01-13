package com.cts.inherit;

import java.util.Scanner;

public class InheritanceDemo {
public static void main(String args[]) {
	Manager m=new Manager();
	m.getData();
	m.display();
	m.getManager();
	m.displayManager();
	Developer d= new Developer();
	d.getDeveloper();
	d.displayDeveloper();
}
}
class Employee{
	int emp_id;
	String ename,company;
	void getData() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter employee id");
		emp_id=Integer.parseInt(s.nextLine());
		System.out.println("enter employee name");
		ename= s.nextLine();
		System.out.println("enter employee company");
		company= s.nextLine();
	}
	void display() {
		System.out.println(emp_id+" : "+ename+" : "+company);
	}
	
}

class Manager extends Employee{
	String[] team=new String[5];
	String dept;
	int n=5;
	void getManager() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter manager team ");
		for(int i=0;i<n;i++) {
			team[i]= sc.nextLine();
		}
		System.out.println("enter manager department");
		dept=sc.nextLine();
	}
	void displayManager() {
		System.out.println("team is:");
		for(int i=0;i<n;i++) {
			System.out.println(team[i]);
		}
		System.out.println("department"+dept);
	}
		
}

class Developer extends Employee{
	String proj_name;
	int duration;
	String domain;
	void getDeveloper() {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter project name");
		proj_name=s1.nextLine();
		System.out.println("enter project duration");
		duration=Integer.parseInt(s1.nextLine());
		System.out.println("enter project domain");
		domain=s1.nextLine();
	}
	void displayDeveloper() {
		System.out.println("project name "+proj_name+" duration is "+duration+" project domain: "+domain);
	
	}
}