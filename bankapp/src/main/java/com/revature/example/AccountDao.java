package com.revature.example;

public interface AccountDao {


	public Balance getAccountBalance(int id);

	public Balance setAccountBalance(int id);

	public void createNewAccount(int addAccountid, int addAccount);
	
	public int getWithdraw(int id, int balance);

	public void updateBalance(int accountid, int balance);
}
