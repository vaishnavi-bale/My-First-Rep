
public class FinalDemo {
	public final double PI;
	FinalDemo(){
		PI=4.5;
	}
	FinalDemo(int x){
			PI=5.5;
	}
	
public static void main(String args[]) {
	FinalDemo f=new FinalDemo();
	System.out.println(f.PI);
}
}
