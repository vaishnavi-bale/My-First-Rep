/*Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 
*/
import java.util.*;

class DuplicateArray{
public static void main(String args[]){
int a[],size,n=0;
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
if(a[i]==a[j])
n++;}}
System.out.println("total number of duplicate values are "+n);
}
}