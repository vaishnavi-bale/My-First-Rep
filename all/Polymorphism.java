package com.cts.inherit;

public class Polymorphism {
	public static final double PI=3.14;
    public void area(double a) {
    	System.out.println("The area of square is: "+(a*a));
    }
    public void area(double l,double b) {
    	System.out.println("The area of rectangle is: "+(l*b));
    }
    public void area(int a,float b) {
    	System.out.println("The area of triangle is: "+(a*a)/2);
    }
    public void area(int a) {
    	System.out.println("The area of circle is: "+(PI*a*a));
    }
    public static void main(String args[]) {
    	Polymorphism p= new Polymorphism();
    	p.area(2);
    	p.area(2,2);
    	p.area(5.2,4.2);
    	p.area(5.2);
    }
}
