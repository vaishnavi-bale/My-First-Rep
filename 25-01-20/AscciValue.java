package practice;

import java.util.Scanner;

public class AscciValue {
public static void main(String ar[]) {
	char input;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a character");
	input=s.nextLine().charAt(0);
	int ascci=input;
	System.out.println("ASCCI value of "+input+" is "+ascci);
	
	
}
}
