package com.virtual.file;

import java.io.File;
import java.util.LinkedList;

public class FileService {
	public static LinkedList<String> getFileNames() {
		
	LinkedList<String> FileNames = new LinkedList<>();
	File Current = new File(".");
	File [] files = Current.listFiles();
	
	if (files != null) {
		for (File file : files) {
			if (file.isFile()) {
				FileNames.add(file.getName());
			}
		}
	
	}
	
	return FileNames;
	}
}
