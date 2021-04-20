package com;

public class BankDemo {
	
	public static void main(String[] args) throws OutOfBlanceExceptio
	{
	Bank b = new Bank();
	
	SavingAccount s1 = new SavingAccount(1,1,5000);
	SavingAccount s2 = new SavingAccount(2,2,2000);
	SavingAccount s3 = new SavingAccount(3,1,3000);
	
    b.addAccount(s1);
    b.addAccount(s2);
    b.addAccount(s3);
    
    System.out.println(b.deposite(4, 5000));   
    System.out.println(b.withdraw(1, 20000));
  
	}
}
