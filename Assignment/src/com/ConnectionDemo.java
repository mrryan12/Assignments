package com;
import java.util.*;

public class ConnectionDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int connid1,customerid1,connid2,customerid2,connid3,customerid3;
		String email1,email2,email3;
		double balance1,balance2,balance3;


		System.out.println("Enter the connectionId");
		connid1=sc.nextInt();

		System.out.println("Enter the CustomerId");
		customerid1=sc.nextInt();

		System.out.println("Enter the customer email");
		email1=sc.next();

		System.out.println("Enter the customer balance");
		balance1=sc.nextDouble();

		System.out.println("Enter the connectionId");
		connid2=sc.nextInt();

		System.out.println("Enter the CustomerId");
		customerid2=sc.nextInt();

		System.out.println("Enter the customer email");
		email2=sc.next();

		System.out.println("Enter the customer balance");
		balance2=sc.nextDouble();

		System.out.println("Enter the connectionId");
		connid3=sc.nextInt();

		System.out.println("Enter the CustomerId");
		customerid3=sc.nextInt();

		System.out.println("Enter the customer email");
		email3=sc.next();

		System.out.println("Enter the customer balance");
		balance3=sc.nextDouble();

		System.out.println("Enter connection id for averageBalance");
		int n = sc.nextInt();

		Connection con1 = new Connection(connid1,customerid1,email1,balance1);
		Connection con2 = new Connection(connid2,customerid2,email2,balance2);
		Connection con3 = new Connection(connid3,customerid3,email3,balance3);

		Connection con[]= {con1,con2,con3};

		double temp = getAverageBalance(con,n);
		if(temp != 0)
			System.out.println("The Average balance for customer with id " +getAverageBalance(con,n));
		else
			System.out.println("There is no match for this id");
		//		
	}
	public static double getAverageBalance(Connection con[],int id) {


		double temp = 0;
		int count = 0;
		for(Connection connection : con)
		{
			if(connection.getConnId() == id) {
				temp += connection.getBalance();
				count++;
			}
		}

		temp = temp/count;

		return (temp);
	}
}
class Connection
{
	private int connId;
	private int customerId;
	private String customerEmail;
	private double balance;

	public Connection(int connId,int customerId,String customerEmail,double balance) {
		this.connId=connId;
		this.customerId=customerId;
		this.customerEmail=customerEmail;
		this.balance=balance;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail=customerEmail;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public int getConnId() {
		return connId;
	}
	public int getCustomerId() {
		return customerId;
	}
}
