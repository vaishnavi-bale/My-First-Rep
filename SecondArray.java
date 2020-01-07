/*Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 */

import java.util.*;

class SecondArray{
public static void main(String args[]){
int a[],b[],size;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
size=s.nextInt();
a=new int[size];
b=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size;i++){
b[i]=a[i];
}
System.out.println("array elements in second array:");
for(int i=0;i<size;i++){
System.out.println(b[i]);
}
}
}
