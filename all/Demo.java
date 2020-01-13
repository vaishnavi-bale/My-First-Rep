package com.cts.innerclass;

class Outer1 {
int x=10;
static int y=10;
  class Inner{
	  public void display() {
		 // System.out.println(x);
		  System.out.println(y);
	  }
  }
}
public class Demo {
	public static void main(String args[]) {
		Outer1 out=new Outer1();
		Outer1.Inner i=out.new Inner();
	    i.display();
	}
}

