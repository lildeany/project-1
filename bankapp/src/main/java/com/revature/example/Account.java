package com.revature.example;



public class Account {
	
	private int id;
	private int starting_balance;

	public Account() {
	super();
}
	
	public Account(int id, int starting_balance) {
		
		this.starting_balance = starting_balance;
		this.id = id;
		}
	
	
	public Account(int starting_balance) {
		this.starting_balance  = starting_balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getStarting_balance() {
		return starting_balance;
	}

	public void setStarting_balance(int starting_balance) {
		this.starting_balance = starting_balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", account_balance=" + ", starting_balance=" + starting_balance
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + starting_balance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		if (starting_balance != other.starting_balance)
			return false;
		return true;
	}	
	
	
	}

	
	