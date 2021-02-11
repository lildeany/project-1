package com.revature.example;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class MainMenu implements Menu {
	private static Logger Log = Logger.getLogger(MainMenu.class);
	private Scanner sc = new Scanner(System.in);
	
	public MainMenu() {
		sc = new Scanner(System.in);
	}

	@Override
	public void display() {
		
		int choice = 0;
		do {
			Log.info("Main Menu");
			Log.info("------------------------");
			Log.info("1.)Exit Login Page");
			Log.info("2.) Login as a customer");
			Log.info("3.) Login as an employee");
			Log.info("Enter a choice between 1 and 3");
			try {
				choice = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				
			}
			switch (choice) {
			case 1:
				break;
			case 2:
				Log.warn("Logged in as a customer");
				Menu customerMenu = new CustomerMenu();
				customerMenu.display();
				break;
			case 3:
				Log.warn("Logged in as an employee");
				Menu employeeMenu = new EmployeeMenu();
				employeeMenu.display();
				break;
			default:
				Log.warn("You did not select right");
				
			}
		}while(choice != 1);
			
		
	}
	

}
