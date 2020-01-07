/*Write a Program to accept three numbers and to display the largest of the three numbers.*/

import java.util.Scanner;

class Largest{
public static void main(String args[]){
int n1,n2,n3;
Scanner s= new Scanner(System.in);
System.out.println("enter 3 numbers");
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
if(n1>n2 && n1>n3)
System.out.println(n1+"is the largest");
else if(n2>n1 && n2>n3)
System.out.println(n2+"is the largest");
else if(n3>n1 && n3>n2)
System.out.println(n3+"is the largest"); 
}
}