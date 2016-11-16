package com.oops.conceptdemo;

import java.io.IOException;
import java.nio.file.*;

public class FilesDemo {

	public static void main(String[] args) throws IOException
	{
		//Demo 1
		/*Path dictionary=Paths.get("src", "com","oops","conceptdemo");
		System.out.println(dictionary);
		Path project=Paths.get(".");
		System.out.println(project);
		System.out.println(project.toAbsolutePath());
		System.out.println(project.toUri());
		System.out.println(project.toAbsolutePath().getParent());
		System.out.println(project.getFileName());
		System.out.println(project.toAbsolutePath().getRoot());
		
		*/
		
		//Demo 2	
		
		
		Files.createDirectory(Paths.get("data"));
		Files.createDirectories(Paths.get("sub1", "sub2","sub3"));
		Files.createFile(Paths.get("sub1", "sub2","sub3", "myFile.txt"));
		
		
	}
}
