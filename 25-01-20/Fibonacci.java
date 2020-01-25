package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String ar[]) {
		int n,a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			n--;
		}
	}
}
