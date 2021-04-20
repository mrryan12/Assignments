package classes_and_objects;

public class Person {
	private String FirstName ;
	private String LastName ;

	public String toString(){
		return (FirstName + " " + LastName);
	}

	public Person(String FirstName,String LastName)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;

	} 

	public static void main(String[] args)

	{
		Person p= new Person("rehan","Ansari");
		String fullName = p.toString();
		System.out.println(fullName);
	}
}
