package com.javafileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.*;
public class FileTest {
	
	@Test
	public void givenFilePathWhenCheckedThenPrintFile() throws IOException {
		//UC2: check file exits
		Path filePath = Paths.get("C:/Users/polle/Desktop/filepath.txt");
		Assert.assertTrue(Files.exists(filePath));
		
		//UC2: delete the file and check file not exist
		
//		if (Files.exists(filePath))
//		{
//			Files.delete(filePath);
//		}
//		Assert.assertTrue(Files.notExists(filePath)); 
		
		//UC2: create directory
		Path path = Paths.get("C:/Users/polle/eclipse-workspace/FileIO/demo/");
		if (Files.exists(path)) {
			Files.delete(path);
		}
		
		Files.createDirectories(path);
		Assert.assertTrue(Files.exists(path));
	}
 
}
