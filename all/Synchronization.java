package com.cts.thread;


public class Synchronization {
	public static void main(String args[]) {
		System.out.println("Main Thread");
		Thread t=Thread.currentThread();
		Resource r=new Resource();
		//t.setPriority(MAX_PRIORITY -2);
		FirstThread1 ft=new FirstThread1(r);
		SecondThread1 st=new SecondThread1(r);
		Thread t1=new Thread(ft);
		t1.start();//it will call run()
		Thread t2=new Thread(st);
		t2.start();//it will call run()
	}
}
	
		
	class FirstThread1 implements Runnable{
		Resource re;
		public FirstThread1(Resource re) {
			this.re=re;
		}
		public void run() {
			re.display("first thread");
		}
	}
	class SecondThread1 implements Runnable{
		Resource res;
		public SecondThread1(Resource res) {
			this.res=res;
		}
		public void run() {
			res.display("second thread");
		}
	}
class Resource{
	public void display(String message) {
		synchronized(this) {
			
		}
		for(int i=1;i<=5;i++) {
			System.out.println(message+" "+i);
		}
	}
}