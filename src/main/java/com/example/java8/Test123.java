package com.example.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Test123 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	String dir = System.getProperty("user.dir");
	//	System.out.println(dir);
		String fileName = "file1.txt";

		ClassLoader classLoader = new Test123().getClass().getClassLoader();

		File file = new File(classLoader.getResource(fileName).getFile());

		// File is found
		System.out.println("File Found : " + file.exists());

		// Read File Content
		String content = new String(Files.readAllBytes(file.toPath()));
		System.out.println(content);

	}

}
