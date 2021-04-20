package classes_and_objects;

import java.util.Scanner;

public class Books {
	private String title;
	private String author; 
	private double cost ;
	private int no_of_books;

	public Books() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Title of Book");
		title = sc.next();

		System.out.println("Enter author name of book");
		author = sc.next();

		System.out.println("Enter the cost of book");
		cost = sc.nextDouble();

		System.out.println("Enter the number of books");
		no_of_books = sc.nextInt();

	}


	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		Books b1 = new Books();
		Books b2 = new Books();
		Books b3 = new Books();
		 
		Books b[]= {b1,b2,b3};

		System.out.println("Enter the title of book that you need");
		String t= sc.next();

		System.out.println("Enter the Number of book that you required");
		int n =sc.nextInt();
		
		int count =0;
		for(int i=1 ; i<b.length; i++)
		{

		if(b[i].title.equals(t) && b[i].no_of_books > n)
		{
			double total = n*b[i].cost;
			System.out.println("The total cost for books is " + total);
			count++;
		}	
		}
		if(count== 0)
		{
			System.out.println("Oops! We don't have enough books or wrong title ");
		}
	}
}
