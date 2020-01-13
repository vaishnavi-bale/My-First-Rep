package com.cts.files;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOBasicOperations {
public static void main(String args[]) throws IOException {
	//Path interface,which is used to create a path
FileSystem fs=FileSystems.getDefault();

//Path path=fs.getPath("C:\\Users\\Dell\\Desktop\\src\\com\\cts\\files");
//Path path=fs.getPath("C:","Users","Dell","Desktop","src","com","cts","files");
Path path=Paths.get("C:","Users","Dell","Desktop","src","com","cts","files","v");
System.out.println("Name Count: "+path.getNameCount());
System.out.println("Is Absolute: "+path.isAbsolute());
System.out.println("Name on index two: "+path.getName(2));
//Files files= files.exists(path);
//Files.createDirectory(path);
//Files.createFile(path);
//Files.createDirectories(path);
boolean value=Files.exists(path);
System.out.println(value);
//Files.copy(path, out)
}
}
