package encapsulationAndInheritance;

import java.util.Scanner;

public class BookDetails {
	
	private static Scanner sc;

	public static void main(String[] args)
	{
		Book book = new Book();
		System.out.println("Enter BookNumber");
		sc = new Scanner(System.in);
		book.setBookNo(sc.nextInt());
		
		System.out.println("Enter Book Title");
		book.setTitle(sc.next());
		
		System.out.println("Enter Book author");
		book.setAuthor(sc.next());
		
		System.out.println("Enter Book price");
		book.setPrice(sc.nextFloat());
	
		EngineeringBook engineeringBook = new EngineeringBook();
		engineeringBook.setBookNo(1);
		engineeringBook.setAuthor("rehan");
		engineeringBook.setCategory("engineeringBook");
		engineeringBook.setPrice(2500);
		engineeringBook.setTitle("java");
		
		
		System.out.print(book.getAuthor());
		System.out.print(" , "+book.getBookNo());
		System.out.print(" , "+book.getPrice());
		System.out.println(" , "+book.getTitle());
		
		
		System.out.print(engineeringBook.getBookNo());
		System.out.print(" , "+engineeringBook.getAuthor());
		System.out.print(" , "+engineeringBook.getCategory());
		System.out.print(" , "+engineeringBook.getPrice());
		System.out.print(" , "+engineeringBook.getTitle());
	}

}
