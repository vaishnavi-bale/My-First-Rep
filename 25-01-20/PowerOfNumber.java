package practice;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String ar[]) {
		int power,number,result=1;
		Scanner s= new Scanner(System.in);
		number=s.nextInt();
		power=s.nextInt();
		for(int i=1;i<=power;i++) {
			result=result*number;
		}
		System.out.println(number+" power of "+power+" is "+result);
	}
}
