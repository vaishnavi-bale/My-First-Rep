/*Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.*/
   import java.util.Scanner;
   class Discount{
   public static void main(String args[]){
   String tv;
   Scanner s= new Scanner(System.in);
   System.out.println("enter which tv you want");
   tv=s.nextLine();
   int size;
   double discount,SP=50000;
   if(tv.equals("CRT")){
   discount= 0.05*SP;
   System.out.println("on CRT discount is"+discount);
   }
   else if(tv.equals("LCD")){
	   System.out.println("enter the size of LCD");
	   size=s.nextInt();
         if(size==14){
			 discount=0.08*SP;
			 System.out.println("on LCD 14 inches discount is"+discount);
		 }
		 if(size==21){
			 discount=0.21*SP;
			 System.out.println("on LCD 21 inches discount is"+discount);
		 }
   }
		 
		 }
		 }