package com.revature.example;

public class EmployeeService {
	
public EmployeeDao employeedao;
	public EmployeeService() {
		employeedao = new EmployeeDaoImpl();
		
	}

	public Balance getAccountBalance(int id) throws AccountNotFoundException {
		Balance balance = employeedao.getAccountBalance(id);
		if(balance != null) {
			return balance;
		}else {
			throw new AccountNotFoundException("Account not found");
		}
	}
	
	public Balance deleteAccountBalance(int id) throws AccountNotFoundException {
		Balance account =  employeedao.deleteAccountBalance(id);
		if (account != null ) {
			return account;
		}else {
			throw new AccountNotFoundException("Account not found");
		}
	}	
		
	}
	
	
		



