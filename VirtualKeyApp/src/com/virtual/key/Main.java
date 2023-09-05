package com.virtual.key;
import java.util.LinkedList;
import java.util.Scanner;
//import java.util.InputMismatchException;
import com.virtual.file.*;
//import com.virtual.file.AddFile;
//import com.virtual.file.DeleteFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int choice = 1; //initialize variable
		//Welcome screen
		System.out.println("***********************WELCOME TO VIRTUAL KEY APPLICATION**********************");
		System.out.println("********************Program developped by Maria Salas (Maritxu)****************");
		System.out.println("--------------------------------------------------------------------------------");
		String path = "C:\\Users\\msalas1\\eclipse-workspace\\VirtualKeyForRepositories\\MyProject\\Files";
		//String path = "kaka";
		//Use of scanner and BufferedReader class to take values through keyboard
				Scanner sc = new Scanner(System.in); //variable definition to introduce options in the main menu
				Scanner scanner  = new Scanner(System.in); //variable definition to introduce options in the submenu 
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//variable to introduce file names
				
		//Use of while statement to show the menu although the choice is 3
		while (choice != 3) {
		//Use of handling exception. To handle the exception of introducing one non integer option	
			try {
			System.out.println("1:Retrieve file names in ascending order 2:Add, delete, search a file 3:Close");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			//Use of switch statement to select the different options of the main menu
			switch (choice) {
			case 1:
				System.out.println("Here you are the files in ascending order");
				//Create a variable FileNames that stores a list of Strings. That list is the result of calling SortFileNames(path)
				//method in the class SortFile
				LinkedList<String> FileNames = SortFile.SortFileNames(path);
				//Use of if statement to declare if there are files or there aren't in the root directory
				if (FileNames.isEmpty()) {
					System.out.println("No files are found");
								
				} else {
					System.out.println("File List :");
					for (String file: FileNames) {
						System.out.println(file);
					}
				}
			break;	
			case 2:
				//Call to showSubMenu method
							showSubMenu(scanner, reader, path);
			break;
				
			case  3:
				System.out.println("Exit Program"); 
			break;
			default:
				System.out.println("Wrong Choice");
			}
			} catch ( java.util.InputMismatchException e) {
				System.out.println("WRONG!!!! Introduce an integer from 1 to 3"); 
				sc.nextLine();
				choice = 1;
			}
			}
		sc.close();
		reader.close();

	}

	private static void showSubMenu(Scanner scanner, BufferedReader reader, String path) throws IOException {
					
			int subChoice = 1;
		//	String path = "C:\\Users\\msalas1\\eclipse-workspace\\VirtualKeyForRepositories\\MyProject\\Files";	
			
			while (subChoice != 4) {
				try {
				System.out.println("1:Add a file 2:Delete a file 3:Search a file 4:Return to Main Menu");
				System.out.println("Plz enter your choice");
				subChoice = scanner.nextInt();
				switch (subChoice) {
				case 1:
					System.out.println("Introduce un fichero ");
					String newFile = reader.readLine();
					//System.out.println(newFile);
					AddFile.AddOneFile(newFile, path);
					break;
				case 2:
					System.out.println("Introduce un fichero ");
					String DelFile = reader.readLine();
					//System.out.println(DelFile);
					DeleteFile.DeleteOneFile(DelFile, path);
					break;
				case 3:
					System.out.println("Introduce un fichero ");
					String SFile = reader.readLine();
					//System.out.println(SFile);
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
