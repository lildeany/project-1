package com.revature.example;

public class CustomerService  {

	public AccountDao accountDao;
	
	public CustomerService() {
		accountDao = new AccountDaoImpl();
	}

	
	public void createNewAccount(int accountid, int start_balance) throws AccountNotFoundException {
		accountDao.createNewAccount(accountid , start_balance);
	
	}

	public Balance getAccountBalance(int id) throws AccountNotFoundException {
		Balance balance = accountDao.getAccountBalance(id);
		if(balance != null) {
			return balance;
		}else {
			throw new AccountNotFoundException("Account not found");
		}
	}
	
	public int getWithdraw(int id, int withdraw) throws AccountNotFoundException{
		
		int balance = accountDao.getAccountBalance(id).getBalance();
		
		if(id <= 0) {
			throw new AccountNotFoundException("Invalid account number");
		}else if(withdraw > balance) {
			throw new AccountNotFoundException("Withdrawal amount exceeds account balance");
		}else if(withdraw <= 0) {
			throw new AccountNotFoundException("Withdrawal cannot be authorized");
		}else {
			balance = balance - withdraw;
			accountDao.getWithdraw(id, balance);
		}
		 
		return balance;
	}
	
	public boolean compareId(int id, int account_id) throws AccountNotFoundException {
		 accountDao.getAccountBalance(id).getBalance();
		 accountDao.getAccountBalance(account_id).getBalance();
		if(id == account_id) {
			throw new AccountNotFoundException("Error Cannot Transfer to the same Account");
		}
		return true;
				
	}	

	public int updateBalance(int id, int withdraw) throws AccountNotFoundException {
		int balance1 = accountDao.getAccountBalance(id).getBalance();
		if(id <= 0) {
			throw new AccountNotFoundException("Withdrawal cannot be authorized");
		}else if(withdraw <= 0) {
			throw new AccountNotFoundException("Withdrawal cannot be authorized");
		
		}
			
			balance1 = withdraw + balance1;
			accountDao.updateBalance(id, balance1);
			
		return balance1;
		}

		
	
	}

	
			
	

