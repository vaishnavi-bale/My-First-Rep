package com.cts.innerclass;

import java.util.Scanner;

 class OwnEception {
public static void main(String args[])  {
	System.out.println("Begin");
	  public static int logic() throws ArrayIndexOutOfBoundsException {
		
		int a=Integer.parseInt(args[0]);
		System.out.println("got the value from user");
		if(a==10) {
			throw new ArithmeticException("not possible");
		}
		int b=10/(10-a);
		System.out.println("b: "+b);
		
	}
	 try {
		 logic();
	 }
	catch (NumberFormatException nfe) {
		System.out.println("enter integer");
	}

}
}
