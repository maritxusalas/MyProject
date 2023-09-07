package com.virtual.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import com.virtual.file.AddFile;
import com.virtual.file.DeleteFile;
import com.virtual.file.SearchFile;

public class SubMenu {
	


static void showSubMenu(Scanner scanner, BufferedReader reader, String path) throws IOException {
	int subChoice = 1;
	while (subChoice != 4) {
		try {
		System.out.println("1:Add a file 2:Delete a file 3:Search a file 4:Return to Main Menu");
		System.out.println("Plz enter your choice");
		subChoice = scanner.nextInt();
		switch (subChoice) {
		case 1:
			System.out.println("Introduce un fichero ");
			String newFile = reader.readLine();
			AddFile.AddOneFile(newFile, path);
			break;
		case 2:
			System.out.println("Introduce un fichero ");
			String DelFile = reader.readLine();
			DeleteFile.DeleteOneFile(DelFile, path);
			break;
		case 3:
			System.out.println("Introduce un fichero ");
			String SFile = reader.readLine();
			SearchFile.SearchOneFile(SFile, path);
			break;
		case 4:
			System.out.println("You are returning to Main Menu");
			break;
		default:
		System.out.println("Opcion no valida");
		}
		}
		catch ( java.util.InputMismatchException e) {
			System.out.println("WRONG!!!! Introduce an integer from 1 to 4"); 
			scanner.nextLine();
			subChoice = 1;
		}
		} 
	}
}