package medicine;

import java.util.Date;

abstract public class Medicine {
	
	private double price;
	private Date expiryDate;
	
	public void getDetails()
	{
		System.out.println("price is : " +price);
		System.out.println("expiry date is : " + expiryDate);
	}
	
	public abstract void displayLabel();
	

}
