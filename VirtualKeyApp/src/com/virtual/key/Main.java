package com.virtual.key;
import java.util.LinkedList;
import java.util.Scanner;
import com.virtual.file.*;
//import com.virtual.file.AddFile;
//import com.virtual.file.DeleteFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int choice;
		//String con;
		String path = "C:\\Users\\msalas1\\eclipse-workspace\\VirtualKeyForRepositories\\MyProject\\Files";
				Scanner sc = new Scanner(System.in);
				Scanner scanner  = new Scanner(System.in);
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1:Retrieve file names in ascending order 2:Add, delete, search a file 3:Close");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Here you are the files in ascending order");
				LinkedList<String> FileNames = SortFile.SortFileNames(path);
				if (FileNames.isEmpty()) {
					System.out.println("File not found");
								
				} else {
					System.out.println("File List :");
					for (String file: FileNames) {
						System.out.println(file);
						
					}
					
				}
			} else if (choice == 2) {
							showSubMenu(scanner, reader);
				
			} else if (choice == 3) {
				System.out.println("Exit Program"); 
				System.exit(0);
			} else {
				System.out.println("Wrong Choice");
			}
			//System.out.println("do you want to continue?");
			//con = sc.next();
		}while (choice != 3);
		//System.out.println("Thank you!");
		sc.close();
		reader.close();

	}

	private static void showSubMenu(Scanner scanner, BufferedReader reader) throws IOException {
					
			int subChoice;
			String path = "C:\\Users\\msalas1\\eclipse-workspace\\VirtualKeyForRepositories\\MyProject\\Files";	
			
			do {
				System.out.println("1:Add a file 2:Delete a file 3:Search a file 4:Return to Main Menu");
				System.out.println("Plz enter your choice");
				subChoice = scanner.nextInt();
				switch (subChoice) {
				case 1:
					System.out.println("Introduce un fichero ");
					String newFile = reader.readLine();
					System.out.println(newFile);
					AddFile.AddOneFile(newFile, path);
				System.out.println("File Added");
					break;
				case 2:
					System.out.println("Introduce un fichero ");
					String DelFile = reader.readLine();
					System.out.println(DelFile);
					DeleteFile.DeleteOneFile(DelFile, path);
					break;
				case 3:
					System.out.println("Introduce un fichero ");
					String SFile = reader.readLine();
					System.out.println(SFile);
					SearchFile.SearchOneFile(SFile, path);
					break;
				case 4:
					System.out.println("You are returning to Main Menu");
					break;
				default:
				System.out.println("Opcion no valida");
				}
			} while (subChoice != 4);
			}
		
	

}
