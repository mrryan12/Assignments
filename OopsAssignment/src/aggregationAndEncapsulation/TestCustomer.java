package aggregationAndEncapsulation;

public class TestCustomer {

	public static void main(String[] args) {
	 Customer customer = new Customer();
	 customer.setCustomerName("Rehan");
	 Address address= new Address("12 street" , "bareilly");
	 customer.setResidentialAddress(address);
	 
	 System.out.println(customer.getCustomerDetails());
	 
	 Customer customer2= new Customer("rehanans",address);
	 System.out.println(customer2.getCustomerDetails());

	}

}
