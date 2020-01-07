/* You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.*/
   
   import java.util.Scanner;
   
   class Product{
   public static void main(String args[]){
   int quantity,unit_price=12,total_price;
   String product;
   Scanner s= new Scanner(System.in);
   System.out.println("enter product name and quantity"); 
   product=s.nextLine();
   quantity=s.nextInt();
   if(product.equals("apple")){
   total_price=quantity*unit_price;
   System.out.println("price is:"+total_price);
   }
   else
	   System.out.println("This product is not avialable");
   }
   }