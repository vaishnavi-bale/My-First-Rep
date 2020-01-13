package com.cts.innerclass;

public class Demo3 {
	public static void main(String[] args) {
		Test3 t=new Test3() {
			public void display() {
				System.out.println("good mrng");
			}
		};
		t.display();
	}
	}
	abstract class Test3{
		abstract public void display();
	}
