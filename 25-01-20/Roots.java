package practice;

import java.util.Scanner;

public class Roots {
public static void main(String ar[]) {
	int a,b,c;
	System.out.println("enter the values of a,b,c");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	double root=Math.sqrt((b*b)-(4*a*c));
	double result=((-b+root)/(2*a*c));
	double result1=((-b-root)/(2*a*c));
	System.out.println("root1 is "+result);
	System.out.println("root2 is "+result1);
}
}
