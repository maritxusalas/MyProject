package com.virtual.file;

import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;

public class DeleteFile {
			public static void DeleteOneFile (String DelFile, String Path) {
			LinkedList<String> FileNames = FileService.getFileNames(Path);
			int i = 0;
			// Here I use interface iterator to search the File DelFile. I remove the file from list and directory
			ListIterator<String> iterator = FileNames.listIterator();
			 while (iterator.hasNext() && i==0) {
		            String ThisFile = iterator.next();
		            if (ThisFile.equalsIgnoreCase(DelFile)) {
		            	iterator.remove();
		            	i = 1;
		            	File dir = new File(Path);
		            	File file = new File (dir, ThisFile);
		            	file.delete();
		            	System.out.println("The file \"" + ThisFile + "\" has been removed");
	             }
			 }
			 if (i == 0) {
				 System.out.println("The file \"" + DelFile + "\" does not exist in root directory");
			 }
	}
}
