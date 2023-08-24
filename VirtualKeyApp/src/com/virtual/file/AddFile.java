package com.virtual.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

public class AddFile {
	public static LinkedList<String> AddOneFile (String NewFile, String Path) {
		LinkedList<String> FileNames = new LinkedList<>();
		try {
		File dir = new File(Path);
		File file = new File (dir, NewFile);
		FileOutputStream fos = new FileOutputStream(file);
		fos.close();
		System.out.println("File added to dir");
		FileNames.add(NewFile);
		System.out.println("File added");
		} catch (IOException e) {
			System.out.println("Error al agregar el archivo " +e.getMessage());
		}
			return FileNames;
			}

}
