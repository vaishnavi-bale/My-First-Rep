package practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String ar[]) {
		int number,reverse=0,temp=0;
		System.out.println("Enter Number");
		Scanner s= new Scanner(System.in);
		number=s.nextInt();
		while(number>0) {
		    temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
		}
		System.out.println("Reverse of "+number+" is "+reverse);
		
	}
}
