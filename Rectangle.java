/*Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.*/

import java.util.Scanner;

class Rectangle{
public static void main(String args[]){
int len, breadth;
Scanner s= new Scanner(System.in);
len=s.nextInt();
breadth=s.nextInt();
int area=len*breadth;
System.out.println("area is "+area);
int per=2*len+2*breadth;
System.out.println("perimeter is "+per);
}
}