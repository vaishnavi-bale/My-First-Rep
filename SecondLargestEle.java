/*Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 */

import java.util.*;

class SecondLargestEle{
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
	for(int j=i+1;j<size;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("the second largest element is "+a[size-2]);
}
}
