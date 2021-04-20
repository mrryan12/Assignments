package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUsers kid = new KidUsers();
		kid.setAge(15);
		kid.RegisterAccount();
		kid.setBookType("Kids");
		kid.RequestBook();
		
		AdultUser adultUser = new AdultUser();
		adultUser.setAge(23);
		adultUser.RegisterAccount();
		adultUser.setBookType("Fiction");
		adultUser.RequestBook();
	}

}
