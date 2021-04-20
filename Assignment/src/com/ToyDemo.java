package com;

public class ToyDemo {

	public static void main(String[] args) {

		Toy one = new Toy("Cat", "Animal", 100, 1);
		Toy two = new Toy("Dog", "Animal", 200, 2);
		Toy three = new Toy("Mango", "fruits", 300, 5);
		Toy four = new Toy("Apple", "fruits", 250, 10);

		Toy[] t = { one, two, three, four };
	  	System.out.println("Least price toy name " + getLeastPriceToy( t, "fruits"));
	}

	public static String getLeastPriceToy(Toy[] t1, String catName) {
		String name1 = null;
		
		for (Toy t : t1) {
			t.getPrice();
			t.getDiscount();
			double p = (t.getPrice())- (t.getPrice() * t.getDiscount()) / 100;
			t.setPrice(p);
		   }

		int count = 0;
		Toy[] tt = new Toy[2];
		
		for (int i = 0; i < t1.length; i++) {
		if (catName.equals(t1[i].getCategory()))
		      {
				tt[count++] = t1[i];
        		}
		     }
		
		if(count == 0)
		{
			System.out.println("Category not found");
		}
		
      if(count !=0) {
		if (tt[0].getPrice() > tt[1].getPrice()) {
			name1 = tt[1].getName();
		}else
		{
			name1 = tt[0].getName();
        }
      }
		return name1;

	}
}

class Toy {
	private String name;
	private String category;
	private double price;
	private double discount;

	public Toy(String name, String category, double price, double discount) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

}
