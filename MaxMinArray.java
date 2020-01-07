/*5. Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 
*/

import java.util.*;

class MaxMinArray{
public static void main(String args[]){
int a[],size,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
size=s.nextInt();
a=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size;i++){
if(a[i]>temp)
temp=a[i];
}
System.out.println(temp+"is the max element");
for(int i=0;i<size;i++){
if(temp>a[i])
temp=a[i];
}
System.out.println(temp+"is the min element");
}
}