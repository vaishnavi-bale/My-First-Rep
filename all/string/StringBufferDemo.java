package com.cts.string;

public class StringBufferDemo {
public static void main(String[] ar) {
	StringBuffer sb= new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Thoripakkam");
	System.out.println(sb.capacity());
	sb.append("chennai");
	System.out.println(sb.capacity());
	StringBuffer sb1= new StringBuffer("hello");
	System.out.println(sb1.capacity());
	StringBuffer sb2= new StringBuffer(5);
	System.out.println(sb2.capacity());
	sb.replace(0, 5, "kara");
	System.out.println(sb);
    System.out.println(sb1.insert(5, "world"));
    

}
}
