package com.revature.example;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class CustomerMenu implements Menu {
	private static Logger Log = Logger.getLogger(MainMenu.class);
	public CustomerService customerService;
	private Scanner sc;

	public CustomerMenu() {
		sc = new Scanner(System.in);
		customerService = new CustomerService();
	}

	@Override
	public void display() {
		System.out.println("");
		int choice = 0;
		do {
			Log.info("Customer Menu");
			Log.info("--------------------");
			Log.info("1.) Back");
			Log.info("2.) Apply for a new Account");
			Log.info("3.) View the balance of an account");
			Log.info("4.) Transferring Money");
			Log.info("Enter a choice between 1 and 4");

			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				Log.warn("Invalid choice");
				Log.warn("Enter a valid choice");
			}
		
		switch (choice) {
			case 1:
				break;
			case 2:
				Log.warn("..... creating a new Account");
				
				Account newAccount = getNewAccount();
				int id = newAccount.getId();
				int startBalance = newAccount.getStarting_balance();
				
			
				try {
				 customerService.createNewAccount(id, startBalance);
				Log.info(" Account number " + id + " already Exists ");
				}catch(AccountNotFoundException e) {
					Log.error(e);
				}
				
				break;
				
			case 3:
				Log.warn("..... getting your balanace");
				int accountBalance = getAccountBalance();
				try {
					Balance balance = customerService.getAccountBalance(accountBalance);
					Log.warn(balance);
				}catch(AccountNotFoundException e) {
					Log.error(e.getMessage());
					
				}
				
				break;
			case 4:
				Log.warn("..... withdrawing from an account");
				/*
				 * Specify the account you want
				 * Specify the withdrawal amount
				 * Specify the new account
				 */
				Log.warn("What account are you withdrawing from?");
					int account_id = readInput();
					Log.warn("How much do you want to withdraw?");
					int amount = Input();
					Log.warn("What account are you depositing to?");
					int new_account = readInput();
			try {
				customerService.compareId(account_id, new_account);
			}catch(AccountNotFoundException e){
				Log.error("Can not Trandfer funds with in the same account");
			}
			try {
				customerService.getWithdraw(account_id, amount);
				customerService.updateBalance(new_account, amount);
				
				
			} catch (AccountNotFoundException e) {
				Log.error(e.getMessage());
				
			}
			default:
			
			}
		} while (choice != 1);
		System.out.println("Invalid Choice");
		System.out.println("Please select a number from 1 to 4");
		}
	

	
	public Account getNewAccount() {
		int start_balance;
		int id;
		
		while (true) {
			try {
				Log.warn("What is your account number? containing only digits");
				id = Integer.parseInt(sc.nextLine());
			
			}catch(NumberFormatException e) {
					Log.warn("invalid account number");
					continue;	
			}
			 
			try {
				Log.warn("What is your starting account balance?");
				start_balance = Integer.parseInt(sc.nextLine());
			
			}catch(NumberFormatException e) {
				Log.warn("Invalid balance");
				continue;
			}
			break;
		}
		
		Account account = new Account();
		account.setId(id);
		account.setStarting_balance(start_balance);
		return account;

	}
	
	public int getAccountBalance() {
		int accountBalance;
		while(true) {
			try {
				Log.warn("What account do you want?");
				accountBalance = Integer.parseInt(sc.nextLine());
				
			}catch(NumberFormatException e) {
				Log.warn("Incorrect account number");
				Log.warn("Try another account number?");
				continue;
			}
			break;
		}
		return accountBalance;
		}
	public int setDeposit(int id, int withdraw) {
		/*
		 * 1. Get the Specific account id
		 * Specify withdraw amount
		 * Deposit withdraw into new id
		 * 
		 * 2
		 */
	 getAccountBalance();
		while(true) {
				try{
					
					Log.warn("How much are you withdrawing?");

				withdraw = Integer.parseInt(sc.nextLine());
				Log.warn("What account are you depositing to?");
				id = Integer.parseInt(sc.nextLine());
				
				
			}catch(NumberFormatException e) {
				Log.warn("Incorrect withdraw amount");
				
				continue;
			}
			break;
		}
		return id;
		
	}
	
	public int readInput() {
		int input = 0;
		
	while(true) {
		try {
			input = Integer.parseInt(sc.nextLine());
			
			
		}catch(NumberFormatException e) {
			Log.warn("Incorrect account number");
			Log.warn("Enter Another account number");
			continue;
		}
		break;
	}
	return input;
}
	public int Input() {
		int input = 0;
		
	while(true) {
		try {
			input = Integer.parseInt(sc.nextLine());
			
			
		}catch(NumberFormatException e) {
			Log.warn("Incorrect withdrawal amount");
			Log.warn("Enter another withdrawal balance");
			continue;
		}
		break;
	}
	return input;
}
}
	

