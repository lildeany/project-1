package com.revature.example;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JUnitImplTest {

	private static JUnit junit;
	
	@BeforeAll
	public static void setJUnit() {
		junit = new JUnitImpl();
	}
	@Test
	void IsValidNumber() {
		boolean result = junit.isValidNumber(2);
		assertTrue(result);
	}
	@Test
	void isNotValidNumber() {
		boolean result = junit.isNotValidNumber(-1);
		assertTrue(result);
	}
	@Test
	void compareFalse() {
		boolean result = junit.compareFalse(1, 2);
		assertFalse(result);
	}

	@Test
	void compareTrue() {
		boolean result = junit.compareTrue(1, 1);
		assertTrue(result);
	}
	@Test
	void notInt() {
		boolean result = junit.notInt(20);
		assertFalse(result);
		
	}
	@Test
	public void update() {
		boolean result = junit.update(10, 5);
		assertTrue(result);
		
	}
	@Test
	public void testWithdraw() {
		boolean result = junit.testWithdraw(10, 6);
		assertTrue(result);
		
	}
	@Test
	public void failedUpdate() {
		boolean result = junit.failedUpdate(1, 5);
		assertFalse(result);
		
}
	@Test
	public void failedtestWithdraw() {
		boolean result = junit.failedtestWithdraw(1, 6);
		assertFalse( result);
		
	}
	
	@Test
	public void validAccount() {
		boolean result = junit.validAccount(1, 10);
		assertTrue(result);
	}
	@Test
	public void InvalidAccount() {
		boolean result = junit.invalidAccount(-3, -1);
		assertFalse(result);
	}

}