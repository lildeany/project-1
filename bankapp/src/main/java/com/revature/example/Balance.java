package com.revature.example;

public class Balance {

	private int id;
	private int balance;
	
	public Balance() {
	super();
	}

	public Balance(int id, int balance) {
		this.id = id;
		this.balance = balance;
		}

	public Balance(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
//	public void setBalance(int balance) {	
//		this.setBalance() = balance;
//	}
//	
	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		return balance;
	}

	@Override
	public String toString() {
		return "Balance [id=" + id + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + balance;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balance other = (Balance) obj;
		if (balance != other.balance)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	

}
