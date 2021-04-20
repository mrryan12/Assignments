package library;

public class KidUsers implements LibraryUser {

	int age;
	String BookType;
	
	public void RegisterAccount() {
          if(age<12)
          {
        	  System.out.println("You have successfully registered under a Kids Account");
          }else
        	  System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}


	public void RequestBook() {
        if(BookType.equals("Kids"))
        {
        	System.out.println("Book Issued successfully");
        }
        else
        	System.out.println("Oops, you are allowed to take only kids books");
	}


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

}
