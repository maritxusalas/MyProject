package com.virtual.file;

import java.util.LinkedList;
import java.util.ListIterator;

public class SearchFile{
	public static void SearchOneFile (String SearchFile, String Path) {
		LinkedList<String> FileNames = FileService.getFileNames(Path);
		int i = 0;
		ListIterator<String> iterator = FileNames.listIterator();
		 while (iterator.hasNext() && i==0) {
	            String ThisFile = iterator.next();
	            if (ThisFile.equalsIgnoreCase(SearchFile)) {
	            	i = 1;
	            	System.out.println("The file \"" + ThisFile + "\" has been found");
	            	}
		 	}
		 if (i == 0) {
			 System.out.println("The file \"" + SearchFile + "\" doesn't exist in the directory");
		 }
}
}
