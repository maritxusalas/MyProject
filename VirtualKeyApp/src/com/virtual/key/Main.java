package com.virtual.key;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int choice;
		String con;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1:Retrieve file names in ascending order 2:Add, delete, search a file 3:Close");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Here you are the files in ascending order");		
			} else if (choice == 2) {
				System.out.println("Do you want to add, delete or search a file?");
			} else if (choice == 3) {
				System.exit(0);
			} else {
				System.out.println("Wrong Choice");
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		}while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
		sc.close();

	}

}
