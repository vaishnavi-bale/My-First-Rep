package practice;

import java.util.Scanner;

public class IsAlphabet {
public static void main(String ar[]) {
	char ch;
	System.out.println("enter a character");
 	Scanner s=new Scanner(System.in);
    ch=s.nextLine().charAt(0);
	if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')) {
		System.out.println(ch+" is alphabet");
	}else {
		System.out.println(ch+" is not an alphabet");
	}
}
}
