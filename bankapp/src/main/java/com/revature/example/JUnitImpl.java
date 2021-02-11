package com.revature.example;

public class JUnitImpl implements JUnit {



	@Override
	public boolean isValidNumber(int n) {
		// TODO Auto-generated method stub
		return (n >= 0);
	}
	
	
	@Override
	public boolean isNotValidNumber(int n) {
		if (n <= 0) {
			
		}
		return true ;
	}

	@Override
	public int returnInt(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public boolean compareFalse(int x, int y) {
		if (x!=y) {
			
		}
		return false;
	}

	@Override
	public boolean compareTrue(int x, int y) {
		if(x == y) {
		
		}
		return true;
	}


	@Override
	public boolean notInt(int n) {
	if(n <= 0) {
		
	}
	return false;
	}
	
	@Override
	public boolean update(int x, int y) {
		 int z = x;
		 int c = y;
		 x = z + c;
		 
		return true;	
	}


	@Override
	public boolean testWithdraw(int a, int b) {
		int c = a;
		int d  = b;
		
		 a = c - d;
		return true;	
		
	}

	
	@Override
	public boolean failedtestWithdraw(int a, int b) {
		int c = a;
		int d  = b;
		
		 a = c - d;
		return false;	
		
	}


	@Override
	public boolean failedUpdate(int x, int y) {
		int z = x;
		 int c = y;
		 x = z + c;
		 
		return false;
	}


	@Override
	public boolean validAccount(int a, int b) {
		if(a > 0) {
			
		}
		if(b >= 0) {
			
		}
		return true;
	}


	@Override
	public boolean invalidAccount(int a, int b) {
		if(a <= 0) {
			
		}
		if(b < 0) {
			
		}
		return false;
	}
	
	


	
	

}
