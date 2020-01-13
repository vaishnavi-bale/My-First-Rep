package com.cts.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {
public static void main(String args[]) throws IOException {
	
	String path="C:\\Users\\Dell\\Desktop\\src\\com\\cts\\files\\data1.txt";
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	FileWriter f=new FileWriter(path);
	//System.out.println("enter the text");
	//String txt=br.readLine();
	String msg="welcome";
			f.write(msg);;
	//f.write(msg);
	//f.close();
//	System.out.println(msg);
			f.close();
			
}
}
