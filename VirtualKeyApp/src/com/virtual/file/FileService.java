package com.virtual.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
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
	Collections.sort(FileNames);
	return FileNames;
	}
}