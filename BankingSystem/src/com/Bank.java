package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bank {

	private ArrayList<Account> accounts;

	public Bank() {
		accounts = new ArrayList<Account>();
	}

	public boolean addAccount(Account ac) {

		boolean b = true;
		if (accounts.size() == 0) {
			accounts.add(ac);
		} else {

			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getAccountId() == ac.getAccountId()) {
					b = false;
					return b;
				}
			}
		}

		accounts.add(ac);
		return b;

	}

	public double deposite(int accountId, double amount) {

		double b = 0;

		/*for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountId() == accountId) {
				b = accounts.get(i).getBalance();
				accounts.get(i).setBalance(b);
				b += amount;

			} else {

			}

		}*/

		Account foundAccount = null;
		for(Account account : accounts)
		{
			if(account.getAccountId() == accountId)
			{
				foundAccount = account;
				break;
			}
		}
		
		if(foundAccount != null)
		{
			foundAccount.setBalance(foundAccount.getBalance() + amount);
			b = foundAccount.getBalance();
			
		}
		else
		{
			b = -1;
		}
		
		//System.out.println(b);

		return b;

	}

	public double withdraw(int accountId, double amount) throws OutOfBlanceExceptio {
		double balance = 0;
		/*
		 * for (int i = 0; i < accounts.size(); i++) { if (accountId ==
		 * accounts.get(i).getAccountId()) {
		 * 
		 * if (accounts.get(i).getBalance() > amount) { balance =
		 * accounts.get(i).getBalance(); balance = balance - amount;
		 * 
		 * } else { throw new OutOfBlanceExceptio(accounts.get(i).getBalance(), amount);
		 * }
		 * 
		 * } else { return -1; }
		 * 
		 * } System.out.println(balance);
		 */
		
		for(Account account: accounts)
		{
			if(account.getAccountId() == accountId)
			{
				
				
				if(account.getBalance() > amount)
				{
					account.setBalance(account.getBalance() - amount);
					balance = account.getBalance();
				}
				else
				{
					throw new OutOfBlanceExceptio(account.getBalance(), amount);
				}
				
				
			}
			else
			{
				balance = -1;
			}
		}
		return balance;
	}

	public Set<Integer> getUniqueCustomerIds() {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < accounts.size(); i++) {
			int id = accounts.get(i).getAccountId();
			s.add(id);
		}
		return s;
	}

	public HashMap<Integer, Account> getAccountHashMap() {

		HashMap<Integer, Account> hm = new HashMap<Integer, Account>();
		for (int i = 0; i < accounts.size(); i++) {
			int id = accounts.get(i).getAccountId();
			hm.put(id, accounts.get(i));
		}
		return hm;

	}

}
