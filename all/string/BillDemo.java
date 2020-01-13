package com.cts.string;

import java.util.Scanner;

public class BillDemo {
	public static void main(String args[]) {
	int java = 5000, c = 3000, c_plus = 2000, python = 10000, angular = 20000;
	Scanner s = new Scanner(System.in);
    String course=s.nextLine();
    int price=0;
    if(course.contains("java"))
	{
		System.out.println("java :" + java+"\n");
		price=price+java;
	}if(course.contains("c"))
	{
		System.out.println("c :" + c+"\n");
		price=price+c;
	}if(course.contains("c_plus"))
	{
		System.out.println("c_plus :" + c_plus+"\n");
		price=price+c_plus;
	}if(course.contains("python"))
	{
		System.out.println("python :" + python+"\n");
		price=price+python;
	}if(course.contains("angular"))
	{
		System.out.println("angular :" + angular+"\n");
		price=price+angular;
	}
	
	System.out.println("final price :"+price);
}}
