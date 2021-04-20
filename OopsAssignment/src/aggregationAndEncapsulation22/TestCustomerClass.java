package aggregationAndEncapsulation22;

public class TestCustomerClass {
	
	public static void main(String[] args)
	{
	Address address = new Address("12 street","Atriya","bareilly");
	Customer customer = new Customer("rehan",address,address);
	
	System.out.println(customer.getCustomerDetails());
	
	}

}
