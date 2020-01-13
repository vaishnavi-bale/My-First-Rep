package firrstQuestion;

import java.util.Scanner;

public class NumberTest {
	public static void main(String args[]) {
		int num;
		Scanner s= new Scanner(System.in);
		num=s.nextLine();
		if(num>0)
			System.out.println("number"+num+"is a positive nuumber");
		else if(num<0)
		System.out.println("number"+"is a negetive number");
		else
			System.out.println("number"+"is zero");
	}

}
