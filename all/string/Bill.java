package com.cts.string;
import java.util.Scanner;
public class Bill {
	public static void main(String args[]) {
		int java=5000,c=3000,c_plus=2000,python=10000,angular=20000;
		Scanner s=new Scanner(System.in);
		char course=' ';
System.out.println("enter the courses u need");
		switch(course) {
		    case 'java': java();
		    case 'c':c();
		    case 'c_plus':c_plus();
		    case 'python':python();
		    case 'angular':angular();
		}
System.out.println("final price:");
		void java() {
			System.out.println("java: "+java);
		}
		void c() {
			System.out.println("C: "+c);
		}
		void c_plus() {
			System.out.println("c_plus: "+c_plus);
		}
		void python() {
			System.out.println("python: "+python);
		}
		void angular()) {
			System.out.println("angular: "+angular);
		}
		
	}

}
