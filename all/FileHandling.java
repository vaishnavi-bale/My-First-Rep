package com.cts.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
public static void main(String args[]) throws IOException {
	String path="C:\\Users\\Dell\\Desktop\\src\\com\\cts\\files\\data.txt";
	//File f=new File(path);
//    System.out.println("can Execute: "+f.canExecute());
//    System.out.println("can Read: "+f.canRead());
//    System.out.println("can Write: "+f.canWrite());
//    System.out.println("File Exists:"+f.exists());
//    System.out.println("Absolute path: "+f.getAbsolutePath());
//    
//    System.out.println("File name:"+f.getName());
//    System.out.println("Write data:");
    FileInputStream fin= new FileInputStream(path);
    FileOutputStream fout=new FileOutputStream("copied.txt");
//	Scanner s=new Scanner(System.in);
//	String msg=s.nextLine();
//	byte[] b=msg.getBytes();
//	fout.write(b);
    int i;
    while((i=fin.read())!=-1){
    	//System.out.println((char)i);
          fout.write(i);
    }
    fout.close();
	fin.close();
}
}
