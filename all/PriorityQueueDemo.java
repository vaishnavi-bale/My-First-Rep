package com.cts.innerclass;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String args[]) {
	PriorityQueue<Integer> p=new PriorityQueue<Integer>();
	p.add(100);
	p.add(200);
	System.out.println(p.peek());
	System.out.println(p.poll());
	
}
}
