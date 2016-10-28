package com.oops.conceptdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		Path dir=Paths.get("src","com","oops","conceptdemo");
		//System.out.println(dir);
		
		try(BufferedReader br=Files.newBufferedReader(dir.resolve("ExceptionDemo.java"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
		}
	}
}
