package practice;

import java.util.Scanner;

public class Largest {

public static void main(String ar[]) {
	int n1,n2,n3;
	System.out.println("enter three numbers");
	Scanner s=new Scanner(System.in);
	n1=s.nextInt();
	n2=s.nextInt();
	n3=s.nextInt();
	if(n1>n2 && n1>n3) {
		System.out.println(n1+" is greater than all");
	}
	else if(n2>n1 && n2>n3) {
		System.out.println(n2+" is greater.");
	}
	else System.out.println(n3+" is greater.");
	
}
}
