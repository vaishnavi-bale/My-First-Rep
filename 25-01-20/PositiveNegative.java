package practice;

import java.util.Scanner;

public class PositiveNegative {

public static void main(String ar[]) {
	int num;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	if(num>0) {
		System.out.println(num+" is a positive number");
	}else System.out.println(num+" is a negative number");
}
}
