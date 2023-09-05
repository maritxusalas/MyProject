package com.virtual.file;

import java.util.Collections;
import java.util.LinkedList;

public class SortFile{
	public static LinkedList<String> SortFileNames(String path) {
		LinkedList<String> FileNames = FileService.getFileNames(path);
		Collections.sort(FileNames);
		return FileNames;
	}

}
