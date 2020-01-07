/*Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9
*/
import java.util.*;

class SortArray{
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
System.out.println("sorted array");
for(int i=0;i<size;i++){
System.out.println(a[i]);
}
}
}