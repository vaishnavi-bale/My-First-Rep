/*Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 */

import java.util.*;

class SumArray{
public static void main(String args[]){
int a[],size,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
size=s.nextInt();
a=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size;i++){
sum=sum+a[i];
}
System.out.println("sum of array elements is "+sum);
}
}