package com;

public class OutOfBlanceExceptio extends Exception {
	
	private double currentBalance;
	private double withDrawAmount;
	

	public OutOfBlanceExceptio(double balance, double withdraw) {
		this.currentBalance = balance;
		this.withDrawAmount = withdraw;
	}
	public String getMessage() {
		 return (currentBalance - withDrawAmount) +""; 
		
		/* return "hello negative balance"; */
	}

}
