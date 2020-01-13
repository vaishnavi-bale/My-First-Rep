package com.cts.string;

public class StringDemo {
	public static void main(String[] args) {
String name=new String("chenn ai");
String addr=new String("thoripakkam");
String name1=new String("chennai");
	System.out.println(name==name1);
	System.out.println(name.length());
	System.out.println(name.equals(name1));
	System.out.println(name.lastIndexOf("n"));
	String date="thrusday 9 jan 2020";
	String[] dates= date.split(" ");
	for(int i=0;i<date.length();i++) {
		System.out.println(dates[i]);
	}
	System.out.println(name.trim());
	
	}
	
}
