package classes_and_objects;

public class BankAccount {
	
	private int AcctNo;
	private double balance ;
	private String AcctType;
	
	public BankAccount(int AcctNo,double balance,String AccType)
	{
		this.AcctNo = AcctNo;
		this.balance= balance;
		this.AcctType=AccType;
	}
	
	public double deposite(double dep)
	{
		balance = balance+dep;
		System.out.println("Deposite ammount is " + dep);
		return balance;
	}
	public double withdraw(double with)
	{
		balance = balance - with;
		System.out.println("withdraw ammount is " + with);
		return balance;
	}
	public void accountDetails()
	{
		System.out.println("Account no is "+ AcctNo);
		System.out.println("Account balance is "+ balance);
		System.out.println("Account Type is "+ AcctType);
	}
	
	public static void main(String[] args)
	{
		BankAccount ba = new BankAccount(123,20000,"saving");
		ba.accountDetails();
		ba.deposite(5000);
		ba.withdraw(10000);
		ba.accountDetails();
	}
}
