package practice;

public class Factorial {
	int fact(int n) {
		if(n==0) {
			return 1;
		}
		else
		return n*fact(n-1); 
	}
	public static void main(String ar[]) {
	
		Factorial fact=new Factorial();
		int factorial=fact.fact(5);
		System.out.println("Factorial is" +factorial);
	}

}
