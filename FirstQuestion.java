/*Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.*/


import java.util.Scanner;

class FirstQuestion {
	public static void main(String args[]) {
		int num;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		if(num>0)
			System.out.println("number"+num+"is a positive nuumber");
		else if(num<0)
		System.out.println("number"+"is a negetive number");
		else
			System.out.println("number"+"is zero");
	}

}