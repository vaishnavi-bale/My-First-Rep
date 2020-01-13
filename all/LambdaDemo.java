package com.cts.thread;

public class LambdaDemo {
public static void main(String args[]) {
	Hello h=(a,b) ->System.out.println(a+b);
	h.add(10,20);
//Runnable r=()->System.out.println("i am runnable interface");
//Thread t= new Thread(r);
//t.start();
}
}
interface Hello{
	public void add(int a,int b);
}