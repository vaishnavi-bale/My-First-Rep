package com.cts.innerclass;

import com.cts.innerclass.Outer1.Inner;

public class Demo1 {
	public static void main(String args[]) {
		Outer2 out=new Outer2();
	    out.display();
	}
}
class Outer2 {
int x=10;
static int y=20;
public void display() {
  class Member{
	  public void show() {
		 System.out.println(x);
		  System.out.println(y);
	  }
  }
  Member m=new Member();
  m.show();
}
}
