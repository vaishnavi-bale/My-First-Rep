package practice;

import java.util.Scanner;

public class EvenOdd {
public static void main(String args[]) {
	int num;
	System.out.println("Enter Number to be checked");
	Scanner s= new Scanner(System.in);
	num=s.nextInt();
	if(num%2==0) {
		System.out.println(num+" is Even Number");
	}
    else {
			System.out.println(num+" is Odd Number");
	}
}
}
