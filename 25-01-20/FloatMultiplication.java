package practice;

import java.util.Scanner;

public class FloatMultiplication {
	float multiply(float a,float b){
		return a*b;
	}
public static void main(String args[]) {
	float firstNum,secondNum,mul;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Two Numbers To Be Multiplied");
	firstNum=s.nextFloat();
	secondNum=s.nextFloat();
	FloatMultiplication f=new FloatMultiplication();
	mul=f.multiply(firstNum,secondNum);
	System.out.println("Multiplication of "+firstNum+" and "+secondNum+" is "+mul);
}

}
