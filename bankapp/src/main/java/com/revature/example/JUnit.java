package com.revature.example;

public interface JUnit {

	public boolean isValidNumber(int n);
	
	public int returnInt(int n);
	
	boolean notInt(int n);
	
	public boolean compareTrue(int x, int y);

	boolean compareFalse(int x, int y);

	boolean isNotValidNumber(int n);
	
	public boolean testWithdraw(int x, int y);
	

	boolean update(int x, int y);
	
	boolean failedUpdate(int x, int y);

	boolean failedtestWithdraw(int a, int b);

	boolean validAccount(int a, int b);
	
	boolean invalidAccount (int a, int b);
	
}
