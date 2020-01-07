/*6. Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47
*/

import java.util.*;

class 	EvenOddArray{
public static void main(String args[]){
int a[],size,even[],odd[],j=0,z=0,n1=0,n2=0;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
size=s.nextInt();
a=new int[size];
even=new int[size];
odd=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size;i++){
if(a[i]%2==0){
	n1++;
even[j]=a[i];
j++;
}else {n2++;
odd[z]=a[i];
z++;
}
System.out.println("even array elements are ");
for(j=0;j<=n1;j++)
	System.out.println(even[j]);
System.out.println("odd array elements are ");
for(z=0;z<=n2;z++)
	System.out.println(odd[z]);
}
}
}
