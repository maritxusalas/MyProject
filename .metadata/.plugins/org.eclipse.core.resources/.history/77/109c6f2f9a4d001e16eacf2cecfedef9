package com.virtual.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

import com.virtual.file.SortFile;

public class MainMenu {
	public static void MenuOptions() throws  IOException {
	int choice = 1; //initialize variable
	String path = "C:\\Users\\msalas1\\eclipse-workspace\\VirtualKeyForRepositories\\MyProject\\Files";
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
						SubMenu.showSubMenu(scanner, reader, path);
		break;
			
		case  3:
			System.out.println("Exit Program"); 
			System.exit(0);
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
}
