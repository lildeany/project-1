package com.revature.example;

import org.apache.log4j.Logger;
public class Application {
private static Logger Log = Logger.getLogger(Application.class);
	public static void main(String[] args) throws AccountNotFoundException {
		Log.info("Welcome to the Login Menu");
		Log.info("-------------------------");
		
		MainMenu mainMenu = new MainMenu();
		mainMenu.display();
	
		Log.info("Signed out");
		

		
	}

}
