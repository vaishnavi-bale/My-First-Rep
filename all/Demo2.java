package com.cts.innerclass;

public class Demo2 {
public static void main(String[] args) {
	Test t=new Test() {
		public void display() {
			System.out.println("good mrng");
		}
	};
	t.display();
}
}
class Test{
	public void display() {
		System.out.println("hello");
	}
}