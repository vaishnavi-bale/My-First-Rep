package practice;

import java.util.Scanner;

public class DigitsInInteger {
	public static void main(String ar[]) {
		int number,noOfDigits=0,temp;
		System.out.println("Enter Number");
		Scanner s= new Scanner(System.in);
		number=s.nextInt();
		while(number>0) {
		temp=number%10;
		noOfDigits++;
		number=number/10;
		}
		System.out.println("number of digits in "+number+" are "+noOfDigits);
	}
}
