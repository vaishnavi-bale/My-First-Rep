package com.cts.thread;

import com.cts.thread.FirstThread.SecondThread;

public class TreadCreation {
public static void main(String args[]) {
	System.out.println("Main Thread");
	Thread t=Thread.currentThread();
	t.setPriority(MAX_PRIORITY -2);
	FirstThread ft=new FirstThread();
	SecondThread st=new SecondThread();
	ft.start();//it will call run()
	st.start();
	
}
}
class FirstThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
			System.out.println("First Thread: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class SecondThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println("First Thread: "+i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
