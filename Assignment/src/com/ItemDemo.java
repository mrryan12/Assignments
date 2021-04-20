package com;
import java.util.*;

public class ItemDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First item id");
		int itemid1 =sc.nextInt();
		System.out.println("Enter the First item Name");
		String itemname1 =sc.next();
		System.out.println("Enter the First item price");
		double price1 =sc.nextDouble();
		System.out.println("Enter the First item Discount");
		double disc1 =sc.nextDouble();
		
		
		
		System.out.println("Enter the second item id");
		int itemid2 =sc.nextInt();
		System.out.println("Enter the second item Name");
		String itemname2 =sc.next();
		System.out.println("Enter the second item price");
		double price2 =sc.nextDouble();
		System.out.println("Enter the second item Discount");
		double disc2 =sc.nextDouble();
		
		
		System.out.println("Enter the third item id");
		int itemid3 =sc.nextInt();
		System.out.println("Enter the third item Name");
		String itemname3 =sc.next();
		System.out.println("Enter the third item price");
		double price3 =sc.nextDouble();
		System.out.println("Enter the third item Discount");
		double disc3 =sc.nextDouble();
		
		
		System.out.println("Enter the Fourth item id");
		int itemid4 =sc.nextInt();
		System.out.println("Enter the Fourth item Name");
		String itemname4 =sc.next();
		System.out.println("Enter the Fourth item price");
		double price4 =sc.nextDouble();
		System.out.println("Enter the Fouth item Discount");
		double disc4 =sc.nextDouble();
		
		System.out.println("Enter the Fifth item id");
		int itemid5 =sc.nextInt();
		System.out.println("Enter the Fifth item Name");
		String itemname5 =sc.next();
		System.out.println("Enter the Fifth item price");
		double price5 =sc.nextDouble();
		System.out.println("Enter the Fifth item Discount");
		double disc5 =sc.nextDouble();

		Item i1 = new Item(itemid1,itemname1,price1,disc1);
		Item i2 = new Item(itemid2,itemname2,price2,disc2);
		Item i3 = new Item(itemid3,itemname3,price3,disc3);
		Item i4 = new Item(itemid4,itemname4,price4,disc4);
		Item i5 = new Item(itemid5,itemname5,price5,disc5);

		Item item[] = {i1,i2,i3,i4,i5};
		System.out.println("Least price Item with discount is " + getLeastPriceItem(item).getItemName());

	}

	public static Item getLeastPriceItem(Item item[]) 
	{
		int i;
		Item it =null;

		
        for(i=1;i<item.length;i++)
        {
        	if(item[i].getItemPrice() - (item[i].getItemPrice()*item[i].getItemDiscount())/100 < item[0].getItemPrice() - (item[0].getItemPrice()*item[0].getItemDiscount())/100)
        	{
        		
        		it = item[i];
        	}
        }
        
        return it;
	}

}

class Item
{
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;

	public Item(int itemId,String itemName,double itemPrice,double itemDiscount) 
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemDiscount=itemDiscount;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double Item) {
		this.itemPrice=itemPrice;
	}

	public double getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(double Item) {
		this.itemDiscount=itemDiscount;
	}
	public int getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
}