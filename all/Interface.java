package com.cts.innerclass;

public class Interface {
	public static void main(String[] args) {
		Test5 t = new Test5
				() {
			public void display() {
				System.out.println("good mrng");
			}
		};
		t.display();
	}
}

interface Test5 {
	public void display();
}
