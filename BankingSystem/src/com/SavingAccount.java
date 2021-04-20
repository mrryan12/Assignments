package com;

public class SavingAccount extends Account {
	
	public SavingAccount(int accountId,int customerId,double balance)
	{
	   super(accountId,customerId,balance);
	   accountId = this.getAccountId();
	   customerId = this.getCustomerId();
	   balance = this.getBalance();	   
	}

	public double deposite(double dep) {	
		dep = dep + this.getBalance();
		return dep;
	}

	public double withdraw(double with) {
		with = this.getBalance() - with;
		return with;
	}

}
