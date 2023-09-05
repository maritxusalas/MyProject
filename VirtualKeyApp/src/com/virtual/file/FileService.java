package com.virtual.file;

import java.io.File;
import java.util.LinkedList;
//This class has a method that returns a LinkedList which contains the names of the files stored in the root directory
public class FileService {
	
	public static LinkedList<String> getFileNames(String path) {
	// Defining a variable type LinkedList
	LinkedList<String> FileNames = new LinkedList<>();
	//Define a variable dir that stores a reference to a class File Object which represents one directory in the files system
	File dir = new File(path);
	if(dir.isDirectory()) {
	//Create a files variable that stores files and subdirectories inside dir directory
	File [] files = dir.listFiles();
	//Using the properties of class Object Names of files are stored in linkedlist variable FileNames
	if (files != null) {
		for (File file : files) {
				FileNames.add(file.getName());
			}
		}
	}
	return FileNames;
	}
}
