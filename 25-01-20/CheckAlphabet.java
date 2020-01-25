package practice;

import java.util.Scanner;

public class CheckAlphabet {
public static void main(String ar[]) {
	char alphabet;
	System.out.println("Enter Alphabet");
	Scanner s=new Scanner(System.in);
	alphabet=s.nextLine().charAt(0);
	if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u') {
		System.out.println(alphabet+" is a vowel");
	}
	else
		System.out.println(alphabet+" is a consonent");
}
}
