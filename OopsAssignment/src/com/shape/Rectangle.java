package com.shape;

public class Rectangle implements Polygon {
	
	private float length;
	private float width;

	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void calcArea() {
		 System.out.println("Area of Rectangle : "+length*width);
	}


	public void calcPeri() {
		 System.out.println("Perimeter of square : "+2*(length+width));
	}

}
