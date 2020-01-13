package com.cts.thread;

public class ThreadDemo {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Thread name: " + t.getName());
		t.setName("cts thread");
		System.out.println("Thread name: " + t.getName());
		System.out.println("Is Thread Deamon: "+t.isDaemon());
		System.out.println("Is Thread Alive"+t.isAlive());
		System.out.println("Thread State:"+t.getState());
	}
}