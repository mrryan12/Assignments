package com.shape;

public class Square implements Polygon {

	private float side;
	public void calcArea() {
	 System.out.println("Area of square : "+side*side);

	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	
	public void calcPeri() {
		 System.out.println("perimeter of square : "+4*side);

	}

}
