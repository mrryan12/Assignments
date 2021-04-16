package bank;

import java.util.ArrayList;
import java.util.Scanner;

import address.Address;
import customer.Customer;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Customer> cus = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		addDetails(c1);
		addDetails(c2);
		addDetails(c3);
	    cus.add(c1);
	    cus.add(c2);
	    cus.add(c3);
	    
		
		showDetails(c1);
		sameResidance();
	}
	
	public static void showDetails(Customer customer)
	{
		System.out.println(customer.getName());
		System.out.print(","+customer.getId());
		System.out.print(","+customer.getAddress().getAddress1());
		System.out.print(","+customer.getAddress().getAddress2());
	}
	public static void addDetails(Customer customer)
	{
	
		
		System.out.println("Enter employee Id");
		int id =sc.nextInt();
		customer.setId(id);
		
		System.out.println("Enter employee Name");
		String name = sc.next();
		customer.setName(name);
		
		Address a1 = new Address();
		
		System.out.println("Enter employee Address1");
		String add1 = sc.next();
		a1.setAddress1(add1);
		
		System.out.println("Enter employee Address2");
		String add2 = sc.next();
		a1.setAddress2(add2);
		customer.setAddress(a1);
		
	}
	
	public static void sameResidance()
	{
		System.out.println("Enter Place for same residance's employee");
		String place = sc.next();
	   for(int i=0;i<cus.size(); i++)
	   {
		 if(place.equals(cus.get(i).getAddress().getAddress1()))
		 {
			System.out.println( cus.get(i).getName());
		 }
	   }
	}

}
