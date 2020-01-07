/* Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.*/
   
   import java.util.Scanner;
   
   class Interview{
   public static void main(String args[]){
   int score1,score2,avg;
   Scanner s= new Scanner(System.in);
   System.out.println("enter score1 and score2");
   score1=s.nextInt();
   score2=s.nextInt();
   if(score1>75 && score2>75){
      avg=(score1+score2)/2;
	  if(avg>=80)
	  System.out.println("You are eligible to attend interview");
	  else
	   System.out.println("SORRY You are not eligible to attend interview");
	   }
   else
   System.out.println("SORRY You are not eligible to attend interview");
   
	}
}	