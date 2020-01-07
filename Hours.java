/*Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).*/
   
   import java.util.Scanner;
   
   class Hours{
   public static void main(String args[]){
   int hours,res;
   Scanner s= new Scanner(System.in);
   hours=s.nextInt();
   res=s.nextInt();
   int pro_hours=hours*res;
   System.out.println("Total number of productive hours ="+pro_hours);
   }
   }
   
