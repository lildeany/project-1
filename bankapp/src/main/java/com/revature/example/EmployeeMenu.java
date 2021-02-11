package com.revature.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class EmployeeMenu implements Menu {
	
	private static Logger Log = Logger.getLogger(EmployeeMenu.class);
	public EmployeeService employeeService;
	private Scanner sc;

	

	public EmployeeMenu() {
		sc = new Scanner(System.in);
		employeeService = new EmployeeService();
	}

	@Override
	public void display() {
		int choice = 0;
		
		do {
			Log.info("Employee Menu");
			Log.info("--------------------");
			Log.info("1.) Back");
			Log.info("2.) View Customer Account");
			Log.info("3.) View all log transactions");
			Log.info("4.) Delete an Account");
			Log.info("Enter a choice between 1 and 4");

			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				Log.error(e.getMessage());
			}
			switch(choice) {
			case 1:
			break;
			case 2:
				/*
				 * View all customer account
				 * to view account learn account id
				 */
				Log.warn("..... getting customer account");
				Log.warn("What is the customers account number");
				int accountBalance = getAccountBalance();
				try {
					Balance balance = employeeService.getAccountBalance(accountBalance);
					Log.warn(balance);
				}catch(AccountNotFoundException e) {
					Log.error(e.getMessage());
					
				}
			
				break;
				
			case 3 :
				Log.warn("..... log transaction");
				Log.warn("These are the log transactions");
				
				try{
					   FileInputStream fstream = new FileInputStream("demoLogs.log");
					   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
					   String strLine;
					   /* read log line by line */
					   while ((strLine = br.readLine()) != null)   {
					     /* parse strLine to obtain what you want */
					     System.out.println (strLine);
					   }
					   fstream.close();
					} catch (Exception e) {
					     System.err.println("Error: " + e.getMessage());
					}
				break;
				
				
				case 4:
				Log.warn("..... getting customer account");
				Log.warn("What account do you want to delete");
				int account = deleteAccountBalance();
				try {
					employeeService.deleteAccountBalance(account);
					Log.info("Account Deleted");
				}catch(AccountNotFoundException e) {
					Log.error(e.getMessage());
					
				}
			
			}
		}
		
	while(choice != 1);
		
		
	}
	
	

	public int getAccountBalance() {
		int accountBalance;
		while(true) {
			try {
				
				accountBalance = Integer.parseInt(sc.nextLine());
				
			}catch(NumberFormatException e) {
				Log.warn("Incorrect account number");
				Log.warn("Enter a valid Account Number");
				continue;
			}
			break;
		}
		return accountBalance;
		}
	
	public int deleteAccountBalance() {
		int accountBalance;
		while(true) {
			try {
				
				accountBalance = Integer.parseInt(sc.nextLine());
				
			}catch(NumberFormatException e) {
				Log.warn("Incorrect account number");
				Log.warn("Enter a valid Account Number");
				continue;
			}
			break;
		}
		return accountBalance;
		}
	
	
	}

	

	


