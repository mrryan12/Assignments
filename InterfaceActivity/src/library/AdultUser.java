package library;

public class AdultUser implements LibraryUser {

	int age;
	String BookType;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBookType() {
		return BookType;
	}


	public void setBookType(String bookType) {
		BookType = bookType;
	}


	public void RegisterAccount() {
		if(age>12)
		{
			System.out.println("You have successfully registered under a Adult Account");
		}else
			System.out.println("Sorry, Age must be greater than 12 to register an adult");
	}


	public void RequestBook() {
		if(BookType.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");

	}

}
