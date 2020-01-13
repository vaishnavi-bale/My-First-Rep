package com.cts.innerclass;

public class Main {
	public static void main(String args[]) {
		Outer.Inner i=new Outer.Inner();
	    i.display();
	}
}

class Outer {
int x=10;
static int y=10;
  static class Inner{
	  public void display() {
		 // System.out.println(x);
		  System.out.println(y);
	  }
  }
}
