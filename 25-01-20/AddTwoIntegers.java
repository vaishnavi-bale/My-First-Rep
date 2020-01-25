package practice;

import java.util.Scanner;

public class AddTwoIntegers {
public static void main(String ar[]) {
	int num1,num2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Two Numbers To Be Added");
	num1=s.nextInt();
	num2=s.nextInt();
	AddTwoIntegers i=new AddTwoIntegers();
	int sum=i.add(num1,num2);
	System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
}
int add(int a,int b) {
	return a+b;
}
}
