package practice;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String ar[]) {
		System.out.println("Enter which number table you want ");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}
