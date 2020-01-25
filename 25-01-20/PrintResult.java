package practice;

import java.util.Scanner;

public class PrintResult {
	int getQuotient(int a,int b) {
		return a/b;
	}
	int getRemainder(int p,int q) {
		return p%q;
	}
	public static void main(String args[]) {
		int num1,num2,quotient,remainder;
        System.out.println("Enter Two Numbers : ");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();
        PrintResult p=new PrintResult();
        quotient=p.getQuotient(num1,num2);
        remainder=p.getRemainder(num1,num2);
        System.out.println("Quotient of "+num1+" and "+num2+" is "+quotient);
        System.out.println("Remainder of "+num1+" and "+num2+" is "+remainder);
	}
}
