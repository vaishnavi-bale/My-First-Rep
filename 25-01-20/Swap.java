package practice;

import java.util.Scanner;

public class Swap {
public static void main(String args[]) {
	int a,b;
	Scanner s=new  Scanner(System.in);
	System.out.println("Enter the value of a and b");
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("Before Swapping : a= "+a+" b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swapping : a= "+a+" b= "+b);

	
}
}
