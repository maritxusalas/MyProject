package com.virtual.file;

import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;

public class DeleteFile extends FileService{
			public static void DeleteOneFile (String DelFile, String Path) {
			LinkedList<String> FileNames = FileService.getFileNames(Path);
			String FileToDelete = DelFile.toLowerCase();
			int i = 0;
			ListIterator<String> iterator = FileNames.listIterator();
			 while (iterator.hasNext() && i==0) {
		            String ThisFile = iterator.next();
		            //System.out.println(ThisFile);
		            if (ThisFile.equalsIgnoreCase(FileToDelete)) {
		            	iterator.remove();
		            	i = 1;
		            	File dir = new File(Path);
		            	File file = new File (dir, ThisFile);
		            	file.delete();
		            	System.out.println("El archivo \"" + ThisFile + "\" ha sido borrado");
		            		
		            }
			 }
			 if (i == 0) {
				 System.out.println("El archivo \"" + DelFile + "\" no existe en el directorio.");
			 }
				
		
	}

}