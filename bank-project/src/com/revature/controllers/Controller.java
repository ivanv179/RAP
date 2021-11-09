package com.revature.controllers;

import java.util.*;
import com.revature.models.*;

public class Controller {
	public static void init() {
		// create scanner and input field
		Scanner s = new Scanner(System.in);
		String input; 
		
		// welcome user
		System.out.println("Welcome would you like to (enter number):\n"
				+ "1) create an account\n"
				+ "2) log in?\n3) exit");
		input = s.nextLine();
		
		// if statement to see if user wants to create account or login
		if (input == "1") {
			System.out.println("Are you an (enter number): 1) employee or 2) customer?");
			input = s.nextLine();
			if (input == "1") {
				System.out.println("First name: ");
				String fName = s.nextLine();
				System.out.println("Last name: ");
				String lName = s.nextLine();
				System.out.println("Username: ");
				String username = s.nextLine();
				System.out.println("Password: ");
				String password = s.nextLine();
				Person employee1 = new Employee(fName, lName, username, password);
			} else if (input == "2") {
				System.out.println("First name: ");
				String fName = s.nextLine();
				System.out.println("Last name: ");
				String lName = s.nextLine();
				System.out.println("Username: ");
				String username = s.nextLine();
				System.out.println("Password: ");
				String password = s.nextLine();
				Person employee1 = new Customer(fName, lName, username, password);
				input = "2";
			}
		} else if (input == "2") {
			System.out.println("Enter username: ");
			String username = s.nextLine();
			System.out.println("Enter password: ");
			String password = s.nextLine();
		} else if (input == "3") {
			System.exit(0);
		}
		
	}
}
