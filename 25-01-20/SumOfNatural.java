package practice;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String args[]) {
		int num,sum=0;
	System.out.println("Enter Number : ");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    for(int i=0;i<=num;i++) {
    	sum=sum+i;
    }
    System.out.println("Sum of first "+num+" natural numbers is "+sum);
}
}
