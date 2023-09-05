package com.virtual.file;

import java.io.File;
import java.util.LinkedList;

public class FileService {
	public static LinkedList<String> getFileNames(String path) {
		
	LinkedList<String> FileNames = new LinkedList<>();
	File dir = new File(path);
	
	if(dir.isDirectory()) {
	File [] files = dir.listFiles();
		
	if (files != null) {
		for (File file : files) {
			
				FileNames.add(file.getName());
			
		}
	
		}
	
	}
	return FileNames;
	}
}
